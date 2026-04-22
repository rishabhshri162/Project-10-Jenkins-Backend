package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DietPlanDTO;

@Repository
public class DietPlanDAOImpl extends BaseDAOImpl<DietPlanDTO> implements DietPlanDAOInt{

	@Override
	public Class<DietPlanDTO> getDTOClass() {
		return DietPlanDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(DietPlanDTO dto, CriteriaBuilder builder, Root<DietPlanDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDietPlanId())) {
			whereCondition.add(builder.like(qRoot.get("dietPlanId"), dto.getDietPlanId() + "%"));
		}
		
		
		if (!isEmptyString(dto.getPlanName())) {
			whereCondition.add(builder.like(qRoot.get("planName"), dto.getPlanName() + "%"));
		}

		return whereCondition;
	}
}
