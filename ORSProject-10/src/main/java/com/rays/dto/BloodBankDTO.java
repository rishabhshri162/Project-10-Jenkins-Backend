package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_bloodbank")
public class BloodBankDTO extends BaseDTO {

	@Column(name = "bloodBankId")
	private String bloodBankId;

	@Column(name = "bloodGroup")
	private String bloodGroup;

	@Column(name = "unitsAvailable")
	private Integer unitsAvailable;

	@Column(name = "location")
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
	public String getValue() {
		return bloodBankId;
	}

	@Override
	public String getUniqueKey() {
		return "bloodBankId";
	}

	@Override
	public String getUniqueValue() {
		return bloodBankId;
	}

	@Override
	public String getLabel() {
		return "blood bank";
	}

	@Override
	public String getTableName() {
		return "blood bank";
	}

}
