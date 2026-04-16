package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BloodBankDAOInt;
import com.rays.dto.BloodBankDTO;

@Service
@Transactional
public class BloodBankServiceImpl extends BaseServiceImpl<BloodBankDTO, BloodBankDAOInt>
		implements BloodBankServiceInt {

}
