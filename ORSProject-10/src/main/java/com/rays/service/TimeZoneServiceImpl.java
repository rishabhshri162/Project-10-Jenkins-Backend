package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.TimeZoneDAOInt;
import com.rays.dto.TimeZoneDTO;

@Service
@Transactional
public class TimeZoneServiceImpl extends BaseServiceImpl<TimeZoneDTO, TimeZoneDAOInt> implements TimeZoneServiceInt{

}
