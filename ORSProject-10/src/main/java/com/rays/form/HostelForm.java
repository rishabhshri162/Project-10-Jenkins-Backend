package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.HostelDTO;

public class HostelForm extends BaseForm {

	@NotEmpty(message = "room no is required")
	private String roomNumber;

	@NotEmpty(message = "resident name is required")
	private String residentName;

	@NotEmpty(message = "customer name is required")
	private String type;

	@NotEmpty(message = "customer name is required")
	private String capacity;

	@NotNull(message = "meeting is required")
	@Min(1)
	private Long cityId;

	private String cityName;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public BaseDTO getDto() {
		HostelDTO dto = initDTO(new HostelDTO());

		dto.setRoomNumber(roomNumber);
		dto.setResidentName(residentName);
		dto.setType(type);
		dto.setCapacity(capacity);
		dto.setCityId(cityId);
		dto.setCityName(cityName);

		return dto;
	}

}
