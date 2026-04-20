package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DataMaskingDTO;

public class DataMaskingForm extends BaseForm {

	@NotEmpty(message = "mask code is required")
	private String maskCode;

	@NotEmpty(message = "field name is required")
	private String fieldName;

	@NotEmpty(message = "mask type is required")
	private String maskType;

	@NotEmpty(message = "status is required")
	private String status;

	public String getMaskCode() {
		return maskCode;
	}

	public void setMaskCode(String maskCode) {
		this.maskCode = maskCode;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMaskType() {
		return maskType;
	}

	public void setMaskType(String maskType) {
		this.maskType = maskType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		DataMaskingDTO dto = initDTO(new DataMaskingDTO());
		dto.setMaskCode(maskCode);
		dto.setFieldName(fieldName);
		dto.setMaskType(maskType);
		dto.setStatus(status);

		return dto;
	}

}
