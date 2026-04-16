package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PurchaseDTO;

@Repository
public class PurchaseDAOImpl extends BaseDAOImpl<PurchaseDTO> implements PurchaseDAOInt {

	@Override
	public Class<PurchaseDTO> getDTOClass() {
		return PurchaseDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(PurchaseDTO dto, CriteriaBuilder builder, Root<PurchaseDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPurchaseCode())) {
			whereCondition.add(builder.like(qRoot.get("purchaseCode"), dto.getPurchaseCode() + "%"));
		}

		return whereCondition;
	}

}
