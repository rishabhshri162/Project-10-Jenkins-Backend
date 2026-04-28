package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.MeetingDAOInt;
import com.rays.dto.MeetingDTO;

@Service
@Transactional
public class MeetingServiceImpl extends BaseServiceImpl<MeetingDTO, MeetingDAOInt> implements MeetingServiceInt {

	@Override
	public MeetingDTO findByName(String name, UserContext userContext) {

		return baseDao.findByUniqueKey("name", name, userContext);
	}

}




