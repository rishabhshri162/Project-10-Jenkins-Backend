package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MeetingDTO;

public class MeetingForm extends BaseForm {

	public static final int ONLINE = 1;
	public static final int OFFLINE = 2;

	@NotEmpty(message = "name is required")
	private String name;

	@NotEmpty(message = "description is required")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static int getOnline() {
		return ONLINE;
	}

	public static int getOffline() {
		return OFFLINE;
	}

	@Override
	public BaseDTO getDto() {
		MeetingDTO dto = initDTO(new MeetingDTO());
		dto.setName(name);
		dto.setDescription(description);

		return dto;
	}

}
