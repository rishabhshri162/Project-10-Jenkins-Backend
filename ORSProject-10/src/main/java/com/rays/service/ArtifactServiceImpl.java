package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ArtifactDAOInt;
import com.rays.dto.ArtifactDTO;

@Service
@Transactional
public class ArtifactServiceImpl extends BaseServiceImpl<ArtifactDTO, ArtifactDAOInt> implements ArtifactServiceInt {

}
