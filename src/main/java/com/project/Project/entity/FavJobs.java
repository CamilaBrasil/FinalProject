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
	@Column(name="user_id")
	private Integer userid;

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

	

	/**
	 * @return the userid
	 */
	public Integer getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FavJobs [favid=" + favid + ", joburl=" + joburl + ", userid=" + userid + "]";
	}

	

	

}
