package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BloodBankDTO;

public class BloodBankForm extends BaseForm {

	@NotEmpty(message = "blood bank id is required")
	private String bloodBankId;

	@NotEmpty(message = "blood Group is required")
	private String bloodGroup;

	@NotNull(message = "units Available blood is required")
	private Integer unitsAvailable;

	@NotEmpty(message = "location is required")
	private String location;

	public String getBloodBankId() {
		return bloodBankId;
	}

	public void setBloodBankId(String bloodBankId) {
		this.bloodBankId = bloodBankId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Integer getUnitsAvailable() {
		return unitsAvailable;
	}

	public void setUnitsAvailable(Integer unitsAvailable) {
		this.unitsAvailable = unitsAvailable;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public BaseDTO getDto() {
		BloodBankDTO dto = initDTO(new BloodBankDTO());

		dto.setBloodBankId(bloodBankId);
		dto.setBloodGroup(bloodGroup);
		dto.setUnitsAvailable(unitsAvailable);
		dto.setLocation(location);

		return dto;
	}

}
