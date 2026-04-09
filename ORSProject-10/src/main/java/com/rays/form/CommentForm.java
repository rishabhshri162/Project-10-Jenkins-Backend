package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CommentDTO;

public class CommentForm extends BaseForm {

	@NotEmpty(message = "comment code is required")
	private String commentCode;
	
	@NotEmpty(message = "user name is required")
	private String userName;
	
	@NotEmpty(message = "content is required")
	private String content;
	
	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {

		CommentDTO dto = initDTO(new CommentDTO());

		dto.setCommentCode(commentCode);
		dto.setUserName(userName);
		dto.setContent(content);
		dto.setStatus(status);

		return dto;
	}

}
