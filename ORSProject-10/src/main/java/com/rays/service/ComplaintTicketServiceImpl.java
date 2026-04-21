package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ComplaintTicketDAOInt;
import com.rays.dto.ComplaintTicketDTO;

@Service
@Transactional
public class ComplaintTicketServiceImpl extends BaseServiceImpl<ComplaintTicketDTO, ComplaintTicketDAOInt>
		implements ComplaintTicketServiceInt {

}
