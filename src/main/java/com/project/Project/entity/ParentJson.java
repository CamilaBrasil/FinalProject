package com.project.Project.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentJson {

	private String stat;
//	@JsonProperty("listing")

	@JsonProperty("listings")
	Listings test;
	

	public Listings getTest() {
		return test;
	}

	public void setTest(Listings test) {
		this.test = test;
	}

	public ParentJson() {

	}

	public ParentJson(String stat, ArrayList<Listing> listing) {
		this.stat = stat;
		// this.listing = listing;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	@Override
	public String toString() {
		return "ParentJson [stat=" + stat + ", test=" + test + "]";
	}



}
