package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DataMaskingDTO;

@Repository
public class DataMaskingDAOImpl extends BaseDAOImpl<DataMaskingDTO> implements DataMaskingDAOInt {

	@Override
	public Class<DataMaskingDTO> getDTOClass() {

		return DataMaskingDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(DataMaskingDTO dto, CriteriaBuilder builder, Root<DataMaskingDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getMaskCode())) {
			whereCondition.add(builder.like(qRoot.get("maskCode"), dto.getMaskCode() + "%"));
		}
		
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		

		return whereCondition;
	}

}
