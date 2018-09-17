package com.project.Project.entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchedObjectDescriptor {

	@JsonProperty("PositionTitle")
	private String positionTitle;
	@JsonProperty("PositionURI")
	private String positionUri;

	@JsonProperty("PositionLocation") // not working yet
	private PositionLocation[] loc;
//
//	@JsonProperty("PositionFormattedDescription")
//	private PositionFormattedDescription[] desc;

	public MatchedObjectDescriptor() {
		// TODO Auto-generated constructor stub
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public String getPositionUri() {
		return positionUri;
	}

	public void setPositionUri(String positionUri) {
		this.positionUri = positionUri;
	}

	public PositionLocation[] getLoc() {
		return loc;
	}

	public void setLoc(PositionLocation[] loc) {
		this.loc = loc;
	}
//
//	public PositionFormattedDescription[] getDesc() {
//		return desc;
//	}
//
//	public void setDesc(PositionFormattedDescription[] desc) {
//		this.desc = desc;
//	}
//
	@Override
	public String toString() {
		return "MatchedObjectDescriptor [positionTitle=" + positionTitle + ", positionUri=" + positionUri + ", loc="
				+ Arrays.toString(loc) +  "]";
	}
	
	

}
