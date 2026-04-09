package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_timezone")
public class TimeZoneDTO extends BaseDTO {

	@Column(name = "timezonecode")
	private String timezoneCode;

	@Column(name = "timezonename")
	private String timezoneName;

	@Column(name = "offset")
	private String offset;

	@Column(name = "status")
	private String status;

	public String getTimezoneCode() {
		return timezoneCode;
	}

	public void setTimezoneCode(String timezoneCode) {
		this.timezoneCode = timezoneCode;
	}

	public String getTimezoneName() {
		return timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return timezoneCode;
	}

	@Override
	public String getUniqueKey() {

		return "timezoneCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return timezoneCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "time zone";
	}

	@Override
	public String getTableName() {
	
		return "time zone";
	}

}
