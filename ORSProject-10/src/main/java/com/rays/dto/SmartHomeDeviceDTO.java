package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_smart")
public class SmartHomeDeviceDTO extends BaseDTO {

	@Column(name = "device_name")
	private String deviceName;

	@Column(name = "device_type")
	private String deviceType;

	@Column(name = "connectivity_type")
	private String connectivityType;

	@Column(name = "power_status")
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
	public String getValue() {
		return deviceName;
	}

	@Override
	public String getUniqueKey() {
		return "deviceName";
	}

	@Override
	public String getUniqueValue() {
		return deviceName;
	}

	@Override
	public String getLabel() {
		return "device name";
	}

	@Override
	public String getTableName() {
		return "Smart home device";
	}

}
