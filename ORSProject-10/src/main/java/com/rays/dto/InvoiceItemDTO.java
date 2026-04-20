package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_invoice")
public class InvoiceItemDTO extends BaseDTO {

	@Column(name = "itemcode")
	private String itemCode;

	@Column(name = "productname")
	private String productName;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "status")
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
	public String getValue() {
		return itemCode;
	}

	@Override
	public String getUniqueKey() {
		return "itemCode";
	}

	@Override
	public String getUniqueValue() {
		return itemCode;
	}

	@Override
	public String getLabel() {
		return "Invoice";
	}

	@Override
	public String getTableName() {
		return "Invoice";
	}

}
