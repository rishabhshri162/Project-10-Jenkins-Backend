package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LabTestDTO;

public class LabTestForm extends BaseForm {

	@NotEmpty(message = "lab test is required")
	private String labTestId;

	@NotEmpty(message = "test name is required")
	private String testName;

	@NotNull(message = "cost is required")
	private Double cost;

	@NotNull(message = "test date is required")
	private Date testDate;

	public String getLabTestId() {
		return labTestId;
	}

	public void setLabTestId(String labTestId) {
		this.labTestId = labTestId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	@Override
	public BaseDTO getDto() {
		LabTestDTO dto = initDTO(new LabTestDTO());
		dto.setLabTestId(labTestId);
		dto.setTestName(testName);
		dto.setCost(cost);
		dto.setTestDate(testDate);

		return dto;
	}

}
