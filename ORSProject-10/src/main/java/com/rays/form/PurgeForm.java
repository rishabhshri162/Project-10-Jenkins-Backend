package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PurgeDTO;

public class PurgeForm extends BaseForm {

	@NotEmpty(message = "purge code is required")
	private String purgeCode;

	@NotEmpty(message = "data type is required")
	private String dataType;

	@NotNull(message = "last run date is required")
	private Date lastRunDate;

	@NotEmpty(message = "status is required")
	private String status;

	public String getPurgeCode() {
		return purgeCode;
	}

	public void setPurgeCode(String purgeCode) {
		this.purgeCode = purgeCode;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Date getLastRunDate() {
		return lastRunDate;
	}

	public void setLastRunDate(Date lastRunDate) {
		this.lastRunDate = lastRunDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		PurgeDTO dto = initDTO(new PurgeDTO());
		dto.setPurgeCode(purgeCode);
		dto.setDataType(dataType);
		dto.setLastRunDate(lastRunDate);
		dto.setStatus(status);

		return dto;
	}

}
