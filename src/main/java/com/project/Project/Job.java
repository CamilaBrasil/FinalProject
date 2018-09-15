package com.project.Project;

public class Job {
	private String jobTitle;
	private String desc;
	private String company;
	private String location;
	private String jobURL;
	
	public Job() {
		
	}

	public Job(String jobTitle, String desc, String company, String location, String jobURL) {
		super();
		this.jobTitle = jobTitle;
		this.desc = desc;
		this.company = company;
		this.location = location;
		this.jobURL = jobURL;
	}

	public Job(String jobTitle, String desc) {
		super();
		this.jobTitle = jobTitle;
		this.desc = desc;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getJobURL() {
		return jobURL;
	}

	public void setJobURL(String jobURL) {
		this.jobURL = jobURL;
	}

	@Override
	public String toString() {
		return "Job [jobTitle=" + jobTitle + ", desc=" + desc + ", company=" + company + ", location=" + location
				+ ", jobURL=" + jobURL + "]";
	}
	
	
}
