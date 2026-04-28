package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MeetingDTO;

@Repository
public class MeetingDAOImpl extends BaseDAOImpl<MeetingDTO> implements MeetingDAOInt{

	@Override
	public Class<MeetingDTO> getDTOClass() {
		return MeetingDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(MeetingDTO dto, CriteriaBuilder builder, Root<MeetingDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {
			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		return whereCondition;
	}

}