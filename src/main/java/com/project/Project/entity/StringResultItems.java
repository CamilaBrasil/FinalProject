package com.project.Project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StringResultItems {
	
	@JsonProperty("MatchedObjectDescriptor")
	private MatchedObjectDescriptor match;
	@JsonProperty("MatchedObjectId")
	private Integer id;
	
	
//	public String getSum() {
//		return sum;
//	}
//
//	public void setSum(String sum) {
//		this.sum = sum;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StringResultItems() {
		// TODO Auto-generated constructor stub
	}

	public MatchedObjectDescriptor getMatch() {
		return match;
	}

	public void setMatch(MatchedObjectDescriptor match) {
		this.match = match;
	}

	@Override
	public String toString() {
		return "StringResultItems [match=" + match + ", id=" + id + "]";
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

	
	

	
	

}
