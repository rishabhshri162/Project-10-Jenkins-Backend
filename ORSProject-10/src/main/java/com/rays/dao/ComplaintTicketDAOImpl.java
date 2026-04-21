package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ComplaintTicketDTO;

@Repository
public class ComplaintTicketDAOImpl extends BaseDAOImpl<ComplaintTicketDTO> implements ComplaintTicketDAOInt {

	@Override
	public Class<ComplaintTicketDTO> getDTOClass() {
		return ComplaintTicketDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ComplaintTicketDTO dto, CriteriaBuilder builder,
			Root<ComplaintTicketDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}

}
