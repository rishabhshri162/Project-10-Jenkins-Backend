package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DataMaskingDAOInt;
import com.rays.dto.DataMaskingDTO;

@Service
@Transactional
public class DataMaskingServiceImpl extends BaseServiceImpl<DataMaskingDTO, DataMaskingDAOInt>
		implements DataMaskingServiceInt {

}
