package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.BaseDAOInt;
import com.rays.dto.BloodBankDTO;

@Repository
public class BloodBankDAOImpl extends BaseDAOImpl<BloodBankDTO> implements BloodBankDAOInt {

	@Override
	public Class<BloodBankDTO> getDTOClass() {
		return BloodBankDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BloodBankDTO dto, CriteriaBuilder builder, Root<BloodBankDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getBloodBankId())) {
			whereCondition.add(builder.like(qRoot.get("bloodBankId"), dto.getBloodBankId() + "%"));
		}

		return whereCondition;
	}

}
