
package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.CustomerDTO;
import com.rays.dto.MeetingDTO;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;

@Repository
public class CustomerDAOImpl extends BaseDAOImpl<CustomerDTO> implements CustomerDAOInt {
	
	@Autowired
	MeetingDAOInt meetingdao;
	
	

	@Override
	protected void populate(CustomerDTO dto, UserContext userContext) {
		if (dto.getMeetingId() != null && dto.getMeetingId() > 0) {
			MeetingDTO meetingDto = meetingdao.findByPK(dto.getMeetingId(), userContext);
			dto.setMeetingName(meetingDto.getName());
		}

	}

	@Override
	public Class<CustomerDTO> getDTOClass() {
		return CustomerDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(CustomerDTO dto, CriteriaBuilder builder, Root<CustomerDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCustomerId())) {
			whereCondition.add(builder.like(qRoot.get("customerId"), dto.getCustomerId() + "%"));
		}
		
		
		if (!isZeroNumber(dto.getMeetingId())) {
			whereCondition.add(builder.equal(qRoot.get("meetingId"), dto.getMeetingId()));
		}

		if (!isEmptyString(dto.getCustomerName())) {
			whereCondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}

		if (!isEmptyString(dto.getImportance())) {
			whereCondition.add(builder.like(qRoot.get("importance"), dto.getImportance() + "%"));
		}

		return whereCondition;
	}

}
