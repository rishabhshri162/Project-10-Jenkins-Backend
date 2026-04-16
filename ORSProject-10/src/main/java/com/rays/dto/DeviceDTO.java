package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_device")
public class DeviceDTO extends BaseDTO {

	@Column(name = "devicecode")
	private String deviceCode;

	@Column(name = "devicename")
	private String deviceName;

	@Column(name = "devicetype")
	private String deviceType;

	@Column(name = "devicestatus")
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
	public String getValue() {
		return deviceCode;
	}

	@Override
	public String getUniqueKey() {
		return "deviceCode";
	}

	@Override
	public String getUniqueValue() {
		return deviceCode;
	}

	@Override
	public String getLabel() {
		return "Device Code";
	}

	@Override
	public String getTableName() {
		return "Device";
	}

}
