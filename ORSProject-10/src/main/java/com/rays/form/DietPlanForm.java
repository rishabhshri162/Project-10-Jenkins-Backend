package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DietPlanDTO;

public class DietPlanForm extends BaseForm {

	@NotEmpty(message = "diet Plan Id is required")
	private String dietPlanId;

	@NotEmpty(message = "plan name is required")
	private String planName;

	@NotNull(message = "duration days is required")
	private Integer durationDays;

	@NotNull(message = "price is required")
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
	public BaseDTO getDto() {
		DietPlanDTO dto = initDTO(new DietPlanDTO());

		dto.setDietPlanId(dietPlanId);
		dto.setPlanName(planName);
		dto.setDurationDays(durationDays);
		dto.setPrice(price);

		return dto;
	}

}
