package com.project.Project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PositionLocation {
	
	@JsonProperty("LocationName")
	private String LocationName;

	public PositionLocation() {
		super();
	}

	public String getLocationName() {
		return LocationName;
	}

	public void setLocationName(String locationName) {
		LocationName = locationName;
	}

	@Override
	public String toString() {
		return "PositionLocation [LocationName=" + LocationName + "]";
	}
	
	

}
