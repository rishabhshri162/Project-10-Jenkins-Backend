package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_hostel")
public class HostelDTO extends BaseDTO {

	@Column(name = "room_number")
	private String roomNumber;

	@Column(name = "resident_name")
	private String residentName;

	@Column(name = "type")
	private String type;

	@Column(name = "capacity")
	private String capacity;

	@Column(name = "city_id")
	private Long cityId;

	@Column(name = "city_name")
	private String cityName;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String getValue() {
		return roomNumber;
	}

	@Override
	public String getUniqueKey() {
		return "RoomNumber";
	}

	@Override
	public String getUniqueValue() {
		return null;
	}

	@Override
	public String getLabel() {
		return "Hostel Room";
	}

	@Override
	public String getTableName() {
		return "Hostel Room";
	}

}
