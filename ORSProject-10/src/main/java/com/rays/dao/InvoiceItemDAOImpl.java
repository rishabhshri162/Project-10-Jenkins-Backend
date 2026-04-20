package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InvoiceItemDTO;

@Repository
public class InvoiceItemDAOImpl extends BaseDAOImpl<InvoiceItemDTO> implements InvoiceItemDAOInt {

	@Override
	public Class<InvoiceItemDTO> getDTOClass() {
		return InvoiceItemDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(InvoiceItemDTO dto, CriteriaBuilder builder, Root<InvoiceItemDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getItemCode())) {
			whereCondition.add(builder.like(qRoot.get("itemCode"), dto.getItemCode() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}

}
