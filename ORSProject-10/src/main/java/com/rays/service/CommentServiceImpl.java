package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CommentDAOInt;
import com.rays.dto.CommentDTO;

@Service
@Transactional
public class CommentServiceImpl extends BaseServiceImpl<CommentDTO, CommentDAOInt> implements CommentServiceInt{

}
