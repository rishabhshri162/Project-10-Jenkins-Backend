package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RechargeDTO;

@Repository
public class RechargeDAOImpl extends BaseDAOImpl<RechargeDTO> implements RechargeDAOInt {

	@Override
	public Class<RechargeDTO> getDTOClass() {
		return RechargeDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(RechargeDTO dto, CriteriaBuilder builder, Root<RechargeDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getRechargeId())) {
			whereCondition.add(builder.like(qRoot.get("rechargeId"), dto.getRechargeId() + "%"));
		}

		return whereCondition;
	}

}
