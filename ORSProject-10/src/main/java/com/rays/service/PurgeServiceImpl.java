package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PurgeDAOInt;
import com.rays.dto.PurgeDTO;

@Service
@Transactional
public class PurgeServiceImpl extends BaseServiceImpl<PurgeDTO, PurgeDAOInt> implements PurgeServiceInt {

}
