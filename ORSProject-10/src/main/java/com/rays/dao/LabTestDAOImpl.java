package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LabTestDTO;

@Repository
public class LabTestDAOImpl extends BaseDAOImpl<LabTestDTO> implements LabTestDAOInt{

	@Override
	public Class<LabTestDTO> getDTOClass() {
		return LabTestDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LabTestDTO dto, CriteriaBuilder builder, Root<LabTestDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getTestName())) {
			whereCondition.add(builder.like(qRoot.get("testName"), dto.getTestName() + "%"));
		}

		return whereCondition;
	}

}
