package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CommentDTO;

@Repository
public class CommentDAOImpl extends BaseDAOImpl<CommentDTO> implements CommentDAOInt {

	@Override
	public Class<CommentDTO> getDTOClass() {
		return CommentDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(CommentDTO dto, CriteriaBuilder builder, Root<CommentDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCommentCode())) {
			whereCondition.add(builder.like(qRoot.get("commentCode"), dto.getCommentCode() + "%"));
		}

		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}

}
