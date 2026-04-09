package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SmartHomeDeviceDTO;

@Repository
public class SmartHomeDeviceDAOImpl extends BaseDAOImpl<SmartHomeDeviceDTO> implements SmartHomeDeviceDAOInt {

	@Override
	public Class<SmartHomeDeviceDTO> getDTOClass() {
		return SmartHomeDeviceDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SmartHomeDeviceDTO dto, CriteriaBuilder builder,
			Root<SmartHomeDeviceDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDeviceName())) {
			whereCondition.add(builder.like(qRoot.get("deviceName"), dto.getDeviceName() + "%"));
		}
		
		if (!isEmptyString(dto.getDeviceType())) {
			whereCondition.add(builder.like(qRoot.get("deviceType"), dto.getDeviceType() + "%"));
		}

		return whereCondition;
	}

}
