package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SmartHomeDeviceDAOInt;
import com.rays.dto.SmartHomeDeviceDTO;

@Service
@Transactional
public class SmartHomeDeviceServiceImpl extends BaseServiceImpl<SmartHomeDeviceDTO, SmartHomeDeviceDAOInt> implements SmartHomeDeviceServiceInt{

}
