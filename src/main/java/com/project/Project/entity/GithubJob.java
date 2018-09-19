package com.project.Project.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubJob {

	private String description;
	private String title;
	private String type;
	private String location;
	@JsonProperty("created_at")
	private String createdAt;
	private String how_to_apply;
	
	public GithubJob() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getHow_to_apply() {
		return how_to_apply;
	}

	public void setHow_to_apply(String how_to_apply) {
		this.how_to_apply = how_to_apply;
	}

	@Override
	public String toString() {
		return "GithubJob [description=" + description + ", title=" + title + ", type=" + type + ", location="
				+ location + ", createdAt=" + createdAt + ", how_to_apply=" + how_to_apply + "]";
	}

	

}