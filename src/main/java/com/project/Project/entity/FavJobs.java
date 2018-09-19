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
	private String joburl;
	private Integer user_id;

	public FavJobs() {
	
	}

	public Integer getFavid() {
		return favid;
	}

	public void setFavid(Integer favid) {
		this.favid = favid;
	}
	
	public String getJoburl() {
		return joburl;
	}

	public void setJoburl(String joburl) {
		this.joburl = joburl;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "FavJobs [favid=" + favid + "," + "joburl=" + joburl + ", user_id=" + user_id
				+ "]";
	}

	

}
