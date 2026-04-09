package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SmartHomeDeviceDTO;

public class SmartHomeDeviceForm extends BaseForm {

	@NotEmpty(message = "device name is required")
	private String deviceName;

	@NotEmpty(message = "device type is required")
	private String deviceType;

	@NotEmpty(message = "connectivity name is required")
	private String connectivityType;

	@NotEmpty(message = "power status is required")
	private String powerStatus;

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

	public String getConnectivityType() {
		return connectivityType;
	}

	public void setConnectivityType(String connectivityType) {
		this.connectivityType = connectivityType;
	}

	public String getPowerStatus() {
		return powerStatus;
	}

	public void setPowerStatus(String powerStatus) {
		this.powerStatus = powerStatus;
	}

	@Override
	public BaseDTO getDto() {
		SmartHomeDeviceDTO dto = initDTO(new SmartHomeDeviceDTO());

		dto.setDeviceName(deviceName);
		dto.setDeviceType(deviceType);
		dto.setConnectivityType(connectivityType);
		dto.setPowerStatus(powerStatus);

		return dto;
	}

}
