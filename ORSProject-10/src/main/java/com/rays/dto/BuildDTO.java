package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_build")
public class BuildDTO extends BaseDTO {

	@Column(name = "buildcode")
	private String buildCode;

	@Column(name = "buildversion")
	private String buildVersion;

	@Column(name = "triggeredby")
	private String triggeredBy;

	@Column(name = "status")
	private String status;

	public String getBuildCode() {
		return buildCode;
	}

	public void setBuildCode(String buildCode) {
		this.buildCode = buildCode;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getTriggeredBy() {
		return triggeredBy;
	}

	public void setTriggeredBy(String triggeredBy) {
		this.triggeredBy = triggeredBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return buildCode;
	}

	@Override
	public String getUniqueKey() {
		return "buildCode";
	}

	@Override
	public String getUniqueValue() {
		return buildCode;
	}

	@Override
	public String getLabel() {
		return "Build";
	}

	@Override
	public String getTableName() {
		return "Build";
	}

}
