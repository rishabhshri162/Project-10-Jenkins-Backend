package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_purchase")
public class PurchaseDTO extends BaseDTO {

	@Column(name = "purchase_id")
	private String purchaseId;

	@Column(name = "purchase_code")
	private String purchaseCode;

	@Column(name = "supplier_name")
	private String supplierName;

	@Column(name = "amount")
	private String amount;

	@Column(name = "status")
	private String status;

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getPurchaseCode() {
		return purchaseCode;
	}

	public void setPurchaseCode(String purchaseCode) {
		this.purchaseCode = purchaseCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return purchaseId;
	}

	@Override
	public String getUniqueKey() {
		return "purchaseId";
	}

	@Override
	public String getUniqueValue() {
		return purchaseId;
	}

	@Override
	public String getLabel() {
		return "Purchase";
	}

	@Override
	public String getTableName() {
		return "Purchase";
	}

}
