package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PurchaseDTO;

public class PurchaseForm extends BaseForm {

	@NotEmpty(message = "purchase Id is required")
	private String purchaseId;

	@NotEmpty(message = "purchase Code is required")
	private String purchaseCode;

	@NotEmpty(message = "supplier Name is required")
	private String supplierName;

	@NotEmpty(message = "amount is required")
	private String amount;

	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {

		PurchaseDTO dto = initDTO(new PurchaseDTO());
		dto.setPurchaseId(purchaseId);
		dto.setPurchaseCode(purchaseCode);
		dto.setSupplierName(supplierName);
		dto.setAmount(amount);
		dto.setStatus(status);

		return dto;
	}

}
