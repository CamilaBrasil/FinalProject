package com.project.Project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StringResultItems {
	
	@JsonProperty("MatchedObjectDescriptor")
	private MatchedObjectDescriptor match;
	


	public StringResultItems() {
		// TODO Auto-generated constructor stub
	}

	public MatchedObjectDescriptor getMatch() {
		return match;
	}

	public void setMatch(MatchedObjectDescriptor match) {
		this.match = match;
	}

//	public PositionLocation getLoc() {
//		return loc;
//	}
//
//	public void setLoc(PositionLocation loc) {
//		this.loc = loc;
//	}
//
//	public PositionFormattedDescription getDesc() {
//		return desc;
//	}
//
//	public void setDesc(PositionFormattedDescription desc) {
//		this.desc = desc;
//	}

	@Override
	public String toString() {
		return "StringResultItems [match=" + match +  "]";
	}

	
	

}
