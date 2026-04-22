package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_dietplan")
public class DietPlanDTO extends BaseDTO {

	@Column(name = "dietplanid")
	private String dietPlanId;

	@Column(name = "planName")
	private String planName;

	@Column(name = "durationdays")
	private Integer durationDays;

	@Column(name = "price")
	private Double price;

	public String getDietPlanId() {
		return dietPlanId;
	}

	public void setDietPlanId(String dietPlanId) {
		this.dietPlanId = dietPlanId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getDurationDays() {
		return durationDays;
	}

	public void setDurationDays(Integer durationDays) {
		this.durationDays = durationDays;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String getValue() {
		return dietPlanId;
	}

	@Override
	public String getUniqueKey() {
		return "dietPlanId";
	}

	@Override
	public String getUniqueValue() {
		return dietPlanId;
	}

	@Override
	public String getLabel() {
		return "Diet Plan";
	}

	@Override
	public String getTableName() {
		return "Diet plan";
	}

}
