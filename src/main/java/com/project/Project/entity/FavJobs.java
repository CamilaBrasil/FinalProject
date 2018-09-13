package com.project.Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="favjobs")
public class FavJobs {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer favid;
	
	@Column(name="jobtitle")
	private String jobTitle;
	private String keywords;
	private String joburl;
	private String description;
	private String location;
	private Integer user_id;

	public FavJobs() {
	
	}

	public FavJobs(Integer favid, String jobTitle, String keyword, String joburl, String description, String location) {

		this.favid = favid;
		this.jobTitle = jobTitle;
		this.keywords = keyword;
		this.joburl = joburl;
		this.description = description;
		this.location = location;
	}

	public FavJobs(String jobTitle, String keyword, String joburl, String description, String location) {
		super();
		this.jobTitle = jobTitle;
		this.keywords = keyword;
		this.joburl = joburl;
		this.description = description;
		this.location = location;
	}

	public Integer getFavid() {
		return favid;
	}

	public void setFavid(Integer favid) {
		this.favid = favid;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getJoburl() {
		return joburl;
	}

	public void setJoburl(String joburl) {
		this.joburl = joburl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	


	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "FavJobs [favid=" + favid + ", jobTitle=" + jobTitle + ", keywords=" + keywords + ", joburl=" + joburl
				+ ", description=" + description + ", location=" + location;
	}
	
	
	
	
	
	
	

}
