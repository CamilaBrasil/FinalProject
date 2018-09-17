package com.project.Project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PositionFormattedDescription {
	
	@JsonProperty("Content")
	private String content;

	public PositionFormattedDescription() {
		super();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PositionFormattedDescription [content=" + content + "]";
	}
	
	

}
