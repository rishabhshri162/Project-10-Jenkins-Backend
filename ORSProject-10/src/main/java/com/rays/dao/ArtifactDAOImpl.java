package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ArtifactDTO;

@Repository
public class ArtifactDAOImpl extends BaseDAOImpl<ArtifactDTO> implements ArtifactDAOInt {

	@Override
	public Class<ArtifactDTO> getDTOClass() {
		return ArtifactDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ArtifactDTO dto, CriteriaBuilder builder, Root<ArtifactDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getArtifactCode())) {
			whereCondition.add(builder.like(qRoot.get("artifactCode"), dto.getArtifactCode() + "%"));
		}
		
		if (!isEmptyString(dto.getArtifactName())) {
			whereCondition.add(builder.like(qRoot.get("artifactName"), dto.getArtifactName() + "%"));
		}
		
		

		return whereCondition;
	}

}
