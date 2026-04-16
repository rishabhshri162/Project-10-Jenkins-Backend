package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_artifact")
public class ArtifactDTO extends BaseDTO {

	@Column(name = "artifactid")
	private String artifactCode;

	@Column(name = "artifactname")
	private String artifactName;

	@Column(name = "version")
	private String version;

	@Column(name = "status")
	private String status;

	public String getArtifactCode() {
		return artifactCode;
	}

	public void setArtifactCode(String artifactCode) {
		this.artifactCode = artifactCode;
	}

	public String getArtifactName() {
		return artifactName;
	}

	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return artifactCode;
	}

	@Override
	public String getUniqueKey() {
		return "artifactCode";
	}

	@Override
	public String getUniqueValue() {
		return artifactCode;
	}

	@Override
	public String getLabel() {
		return "Artifact";
	}

	@Override
	public String getTableName() {
		return "Artifact";
	}

}
