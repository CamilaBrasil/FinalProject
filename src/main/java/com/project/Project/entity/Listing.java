package com.project.Project.entity;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Listing {

	private int total;
	private String perpage;
	private int page;
	private int pages;
	private String last_update;
	private ArrayList<JobReturn> job;
	
	public Listing() {
		
	}

	public Listing(int total, String perpage, int page, int pages, String last_update, ArrayList<JobReturn> job) {
		this.total = total;
		this.perpage = perpage;
		this.page = page;
		this.pages = pages;
		this.last_update = last_update;
		this.job = job;
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
		return "Listing [total=" + total + ", perpage=" + perpage + ", page=" + page + ", pages=" + pages
				+ ", last_update=" + last_update + ", job=" + job + "]";
	}
	
	
	
	
}
