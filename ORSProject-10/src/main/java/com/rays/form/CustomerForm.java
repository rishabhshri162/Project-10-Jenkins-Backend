package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CustomerDTO;

public class CustomerForm extends BaseForm {

	@NotEmpty(message = "customer id is required")
	private String customerId;

	@NotEmpty(message = "customer name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Customer Name must contain only alphabets")
	private String customerName;

	@NotEmpty(message = "location is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Location must contain only alphabets")
	private String location;

	@NotEmpty(message = "contact number is required")
	@Pattern(regexp = "^[0-9]{10}$", message = "Must be 10 digits")
	private String contactNumber;

	@NotEmpty(message = "importance is required")
	private String importance;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	@Override
	public BaseDTO getDto() {

		CustomerDTO dto = initDTO(new CustomerDTO());

		dto.setCustomerId(customerId);
		dto.setCustomerName(customerName);
		dto.setLocation(location);
		dto.setContactNumber(contactNumber);
		dto.setImportance(importance);

		return dto;
	}

}
