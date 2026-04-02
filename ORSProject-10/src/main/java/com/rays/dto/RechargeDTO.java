package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_recharge")
public class RechargeDTO extends BaseDTO {

	@Column(name = "recharge_id")
	private String rechargeId;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "amount")
	private Double amount;
	

	@Column(name = "recharge_date")
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
	public String getValue() {
		return rechargeId;
	}

	@Override
	public String getUniqueKey() {
		return "rechargeId";
	}

	@Override
	public String getUniqueValue() {
		return rechargeId;
	}

	@Override
	public String getLabel() {
		return "recharge id";
	}

	@Override
	public String getTableName() {
		return "Recharge";
	}

}
