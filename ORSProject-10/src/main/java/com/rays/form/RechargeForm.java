package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RechargeDTO;

public class RechargeForm extends BaseForm {

	@NotEmpty(message = "recharge id is required")
	private String rechargeId;

	@NotEmpty(message = "mobile number is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String mobileNumber;

	@NotNull(message = "amount is required")
	private Double amount;

	@NotNull(message = "recharge date is required")
	private Date rechargeDate;

	public String getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getRechargeDate() {
		return rechargeDate;
	}

	public void setRechargeDate(Date rechargeDate) {
		this.rechargeDate = rechargeDate;
	}

	@Override
	public BaseDTO getDto() {
		RechargeDTO dto = initDTO(new RechargeDTO());

		dto.setRechargeId(rechargeId);
		dto.setMobileNumber(mobileNumber);
		dto.setAmount(amount);
		dto.setRechargeDate(rechargeDate);

		return dto;
	}

}
