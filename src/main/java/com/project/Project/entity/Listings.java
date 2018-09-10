package com.project.Project.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Listings {

	private String stat;
	private ArrayList<Listing> listing;

	public Listings() {

	}

	public Listings(String stat, ArrayList<Listing> listing) {
		this.stat = stat;
		this.listing = listing;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public ArrayList<Listing> getListing() {
		return listing;
	}

	public void setListing(ArrayList<Listing> listing) {
		this.listing = listing;
	}

	@Override
	public String toString() {
		return "Listings [stat=" + stat + ", listing=" + listing + "]";
	}
	
	

}
