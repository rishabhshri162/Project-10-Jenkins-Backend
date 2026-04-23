package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SlaDAOInt;
import com.rays.dto.SlaDTO;

@Service
@Transactional
public class SlaServiceImpl extends BaseServiceImpl<SlaDTO, SlaDAOInt> implements SlaServiceInt{

}
