package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_labtest")
public class LabTestDTO extends BaseDTO {

	@Column(name = "lab_test_id")
	private String labTestId;

	@Column(name = "test_name")
	private String testName;

	@Column(name = "cost")
	private Double cost;

	@Column(name = "test_Date")
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
	public String getValue() {
		return labTestId;
	}

	@Override
	public String getUniqueKey() {
		return "labTestId";
	}

	@Override
	public String getUniqueValue() {
		return labTestId;
	}

	@Override
	public String getLabel() {
		return "Lab Test";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Lab Test";
	}

}
