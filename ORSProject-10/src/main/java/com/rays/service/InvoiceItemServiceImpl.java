package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.InvoiceItemDAOInt;
import com.rays.dto.InvoiceItemDTO;

@Service
@Transactional
public class InvoiceItemServiceImpl extends BaseServiceImpl<InvoiceItemDTO, InvoiceItemDAOInt>
		implements InvoiceItemServiceInt {

}
