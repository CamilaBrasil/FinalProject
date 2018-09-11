package com.project.Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public FavJobs() {
	
	}

	public FavJobs(Integer favid, String jobTitle, String keyword, String joburl, String description, String location,
			User user) {

		this.favid = favid;
		this.jobTitle = jobTitle;
		this.keywords = keywords;
		this.joburl = joburl;
		this.description = description;
		this.location = location;
		this.user = user;
	}

	public FavJobs(String jobTitle, String keyword, String joburl, String description, String location, User user) {
		super();
		this.jobTitle = jobTitle;
		this.keywords = keywords;
		this.joburl = joburl;
		this.description = description;
		this.location = location;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "FavJobs [favid=" + favid + ", jobTitle=" + jobTitle + ", keywords=" + keywords + ", joburl=" + joburl
				+ ", description=" + description + ", location=" + location + ", user=" + user + "]";
	}
	
	
	
	
	
	
	

}