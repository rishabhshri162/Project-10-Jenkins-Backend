package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_customer")
public class CustomerDTO extends BaseDTO {

	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "location")
	private String location;

	@Column(name = "contact_number")
	private String contactNumber;

	@Column(name = "importance")
	private String importance;

	@Column(name = "meeting_id")
	private Long meetingId;

	@Column(name = "meeting_name")
	private String meetingName;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public Long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}

	public String getMeetingName() {
		return meetingName;
	}

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	@Override
	public String getValue() {
		return customerId;
	}

	@Override
	public String getUniqueKey() {
		return "customerId";
	}

	@Override
	public String getUniqueValue() {
		return customerId;
	}

	@Override
	public String getLabel() {
		return "Customer";
	}

	@Override
	public String getTableName() {
		return "Customer";
	}
}
