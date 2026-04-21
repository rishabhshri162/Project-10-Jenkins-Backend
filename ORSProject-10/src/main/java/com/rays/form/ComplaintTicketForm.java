package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ComplaintTicketDTO;

public class ComplaintTicketForm extends BaseForm {

	@NotEmpty(message = "complaint ticket id is required")
	private String complaintTicketId;

	@NotEmpty(message = "issue type is required")
	private String issueType;

	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		ComplaintTicketDTO dto = initDTO(new ComplaintTicketDTO());
		dto.setComplaintTicketId(complaintTicketId);
		dto.setIssueType(issueType);
		dto.setStatus(status);

		return dto;
	}

}
