package com.project.Project.entity;

import javax.persistence.Entity;

@Entity
public class Company {

	private String keywords;
	private String apply_url;
	private String url;

	public Company() {

	}

	public Company(String keywords, String apply_url, String url) {
		this.keywords = keywords;
		this.apply_url = apply_url;
		this.url = url;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getApply_url() {
		return apply_url;
	}

	public void setApply_url(String apply_url) {
		this.apply_url = apply_url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Company [keywords=" + keywords + ", apply_url=" + apply_url + ", url=" + url + "]";
	}

}
