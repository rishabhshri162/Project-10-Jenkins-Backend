package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InvoiceItemDTO;

public class InvoiceItemForm extends BaseForm {

	@NotEmpty(message = "item code is required")
	private String itemCode;

	@NotEmpty(message = "product name is required")
	private String productName;

	@NotNull(message = "quantity is required")
	private Integer quantity;

	@NotEmpty(message = "status is required")
	private String status;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		InvoiceItemDTO dto = initDTO(new InvoiceItemDTO());

		dto.setItemCode(itemCode);
		dto.setProductName(productName);
		dto.setQuantity(quantity);
		dto.setStatus(status);

		return dto;
	}

}
