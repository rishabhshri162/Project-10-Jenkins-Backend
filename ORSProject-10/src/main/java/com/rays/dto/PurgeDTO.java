package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_purge")
public class PurgeDTO extends BaseDTO {

	@Column(name = "purgecode")
	private String purgeCode;

	@Column(name = "datatype")
	private String dataType;

	@Column(name = "lastrundate")
	private Date lastRunDate;

	@Column(name = "status")
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
	public String getValue() {
		return purgeCode;
	}

	@Override
	public String getUniqueKey() {
		return "purgeCode";
	}

	@Override
	public String getUniqueValue() {
		return purgeCode;
	}

	@Override
	public String getLabel() {
		return "Purge";
	}

	@Override
	public String getTableName() {
		return "Purge";
	}

}
