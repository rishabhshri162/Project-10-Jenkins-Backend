package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TimeZoneDTO;

public class TimeZoneForm extends BaseForm {

	@NotEmpty(message = "time zone code is required")
	private String timezoneCode;

	@NotEmpty(message = "time zone name is required")
	private String timezoneName;

	@NotEmpty(message = "offset is required")
	private String offset;

	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {

		TimeZoneDTO dto = initDTO(new TimeZoneDTO());

		dto.setTimezoneCode(timezoneCode);
		dto.setTimezoneName(timezoneName);
		dto.setOffset(offset);
		dto.setStatus(status);

		return dto;
	}

}
