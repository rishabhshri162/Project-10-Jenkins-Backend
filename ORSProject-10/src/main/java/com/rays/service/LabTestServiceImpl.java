package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LabTestDAOInt;
import com.rays.dto.LabTestDTO;

@Service
@Transactional
public class LabTestServiceImpl extends BaseServiceImpl<LabTestDTO, LabTestDAOInt> implements LabTestServiceInt{

}
