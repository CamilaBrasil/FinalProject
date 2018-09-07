package com.project.Project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.api.services.jobs.v3.model.Job;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MatchingJob {

	private Job job;

	public MatchingJob() {
		
	}
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	
	
}
