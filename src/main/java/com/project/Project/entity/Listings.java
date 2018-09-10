package com.project.Project.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Listings {

	@JsonProperty("listing")
	private ArrayList<Listing> listing;

	public Listings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Listing> getListing() {
		return listing;
	}

	public void setListing(ArrayList<Listing> listing) {
		this.listing = listing;
	}

	@Override
	public String toString() {
		return "Listings [listing=" + listing + "]";
	}

}
