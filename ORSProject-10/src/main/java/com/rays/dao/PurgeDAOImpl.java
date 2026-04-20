package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PurgeDTO;

@Repository
public class PurgeDAOImpl extends BaseDAOImpl<PurgeDTO> implements PurgeDAOInt {

	@Override
	public Class<PurgeDTO> getDTOClass() {
		return PurgeDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(PurgeDTO dto, CriteriaBuilder builder, Root<PurgeDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPurgeCode())) {
			whereCondition.add(builder.like(qRoot.get("purgeCode"), dto.getPurgeCode() + "%"));
		}
		
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}


		return whereCondition;
	}
}
