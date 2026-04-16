package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DeviceDTO;

public class DeviceForm extends BaseForm {

	@NotEmpty(message = "device code is required")
	private String deviceCode;

	@NotEmpty(message = "device name is required")
	private String deviceName;

	@NotEmpty(message = "device type is required")
	private String deviceType;

	@NotEmpty(message = "status is required")
	private String status;

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		DeviceDTO dto = initDTO(new DeviceDTO());
		
		dto.setDeviceCode(deviceCode);
		dto.setDeviceName(deviceName);
		dto.setDeviceType(deviceType);
		dto.setStatus(status);

		return dto;
	}

}
