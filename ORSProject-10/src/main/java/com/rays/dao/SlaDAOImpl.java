package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SlaDTO;

@Repository
public class SlaDAOImpl extends BaseDAOImpl<SlaDTO> implements SlaDAOInt{

	@Override
	public Class<SlaDTO> getDTOClass() {
		return SlaDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SlaDTO dto, CriteriaBuilder builder, Root<SlaDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSlaCode())) {
			whereCondition.add(builder.like(qRoot.get("slaCode"), dto.getSlaCode() + "%"));
		}
		
		if (!isEmptyString(dto.getServiceName())) {
			whereCondition.add(builder.like(qRoot.get("serviceName"), dto.getServiceName() + "%"));
		}
		

		return whereCondition;
	}

}
