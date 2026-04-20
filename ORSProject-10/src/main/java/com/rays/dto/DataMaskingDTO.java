package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_masking")
public class DataMaskingDTO extends BaseDTO {

	@Column(name = "maskcode")
	private String maskCode;

	@Column(name = "fieldname")
	private String fieldName;

	@Column(name = "masktype")
	private String maskType;

	@Column(name = "status")
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
	public String getValue() {
		return maskCode;
	}

	@Override
	public String getUniqueKey() {
		return "maskCode";
	}

	@Override
	public String getUniqueValue() {
		return maskCode;
	}

	@Override
	public String getLabel() {
		return "Data Masking";
	}

	@Override
	public String getTableName() {
		return "Data Masking";
	}

}
