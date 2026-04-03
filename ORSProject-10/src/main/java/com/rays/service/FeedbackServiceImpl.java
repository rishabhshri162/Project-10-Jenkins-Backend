package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FeedbackDAOInt;
import com.rays.dto.FeedbackDTO;

@Service
@Transactional
public class FeedbackServiceImpl extends BaseServiceImpl<FeedbackDTO, FeedbackDAOInt> implements FeedbackServiceInt{

}
