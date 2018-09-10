package com.project.Project.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Listing {

	private String id;
	private String title;
	private String description;
	private String perks;

	private int total;
	private String perpage;
	private int page;
	private int pages;
	private String last_update;
	private ArrayList<JobReturn> job;

	public Listing() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPerks() {
		return perks;
	}

	public void setPerks(String perks) {
		this.perks = perks;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getPerpage() {
		return perpage;
	}

	public void setPerpage(String perpage) {
		this.perpage = perpage;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

	public ArrayList<JobReturn> getJob() {
		return job;
	}

	public void setJob(ArrayList<JobReturn> job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Listing [id=" + id + ", title=" + title + ", description=" + description + ", perks=" + perks
				+ ", total=" + total + ", perpage=" + perpage + ", page=" + page + ", pages=" + pages + ", last_update="
				+ last_update + ", job=" + job + "]";
	}

}
