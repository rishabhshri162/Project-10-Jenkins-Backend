package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DietPlanDAOInt;
import com.rays.dto.DietPlanDTO;

@Service
@Transactional
public class DietPlanServiceImpl extends BaseServiceImpl<DietPlanDTO, DietPlanDAOInt> implements DietPlanServiceInt{

}
