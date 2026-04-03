package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_feedbackform")
public class FeedbackDTO extends BaseDTO{

	@Column(name = "feedbackformid")
	private String feedbackFormId;

	@Column(name = "participantname")
	private String participantName;

	@Column(name = "rating")
	private Integer rating;

	@Column(name = "comments")
	private String comments;

	public String getFeedbackFormId() {
		return feedbackFormId;
	}

	public void setFeedbackFormId(String feedbackFormId) {
		this.feedbackFormId = feedbackFormId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String getValue() {
		return feedbackFormId;
	}

	@Override
	public String getUniqueKey() {
		return "feedbackFormId";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return feedbackFormId;
	}

	@Override
	public String getLabel() {
		return "form";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Feedback form";
	}

}
