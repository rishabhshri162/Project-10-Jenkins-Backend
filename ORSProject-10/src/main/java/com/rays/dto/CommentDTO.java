package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_comment")
public class CommentDTO extends BaseDTO {

	@Column(name = "comment_code")
	private String commentCode;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "status")
	private String status;

	public String getCommentCode() {
		return commentCode;
	}

	public void setCommentCode(String commentCode) {
		this.commentCode = commentCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return commentCode;
	}

	@Override
	public String getUniqueKey() {
		return "commentCode";
	}

	@Override
	public String getUniqueValue() {
		return commentCode;
	}

	@Override
	public String getLabel() {
		return "commentCode";
	}

	@Override
	public String getTableName() {
		return "commentCode";
	}

}
