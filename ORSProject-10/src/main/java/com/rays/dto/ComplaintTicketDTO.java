package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_complaint")
public class ComplaintTicketDTO extends BaseDTO {

	@Column(name = "complaintTicketId")
	private String complaintTicketId;

	@Column(name = "issueType")
	private String issueType;

	@Column(name = "status")
	private String status;

	public String getComplaintTicketId() {
		return complaintTicketId;
	}

	public void setComplaintTicketId(String complaintTicketId) {
		this.complaintTicketId = complaintTicketId;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return complaintTicketId;
	}

	@Override
	public String getUniqueKey() {
		return "complaintTicketId";
	}

	@Override
	public String getUniqueValue() {
		return complaintTicketId;
	}

	@Override
	public String getLabel() {
		return "Complaint Ticket";
	}

	@Override
	public String getTableName() {
		return "Complaint Ticket";
	}

}
