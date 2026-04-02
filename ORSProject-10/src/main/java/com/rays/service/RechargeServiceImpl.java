package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.RechargeDAOInt;
import com.rays.dto.RechargeDTO;

@Service
@Transactional
public class RechargeServiceImpl extends BaseServiceImpl<RechargeDTO, RechargeDAOInt> implements RechargeServiceInt{

}
