package com.project.Project.entity;

public class Job {
	private String jobTitle;
	private String desc;
	private String company;
	private String location;
	private String joburl;
	private String keywords;
	
	public Job() {
		
	}

	public Job(String jobTitle, String desc, String company, String location, String joburl) {
		super();
		this.jobTitle = jobTitle;
		this.desc = desc;
		this.company = company;
		this.location = location;
		this.joburl = joburl;
	}

	public Job(String jobTitle, String desc) {
		super();
		this.jobTitle = jobTitle;
		this.desc = desc;
	}
	
	public Job(String jobTitle) {
		super();
		this.jobTitle = jobTitle;
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

	public String getJoburl() {
		return joburl;
	}

	public void setJoburl(String joburl) {
		this.joburl = joburl;
	}
	
		public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Override
	public String toString() {
		return "Job [jobTitle=" + jobTitle + ", desc=" + desc + ", company=" + company + ", location=" + location
				+ ", joburl=" + joburl + "]";
	}
	
	
}
