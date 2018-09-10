package com.project.Project.entity;

import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JobReturn {

	private String id;
	private String title;
	private String description;
	private String perks;
//	private String howto_apply;
//	private String post_date;
//	private int relocation_assitance;
//	private int telecommuting;
//	private ArrayList<Category> category;
//	private ArrayList<Type> type;
//	private ArrayList<Company> company;
	
	public JobReturn() {
		
	}

	public JobReturn(String id, String title, String description, String perks, String howto_apply, String post_date,
			int relocation_assitance, int telecommuting, ArrayList<Category> category, ArrayList<Type> type,
			ArrayList<Company> company) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.perks = perks;
//		this.howto_apply = howto_apply;
//		this.post_date = post_date;
//		this.relocation_assitance = relocation_assitance;
//		this.telecommuting = telecommuting;
//		this.category = category;
//		this.type = type;
//		this.company = company;
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

//	public String getHowto_apply() {
//		return howto_apply;
//	}
//
//	public void setHowto_apply(String howto_apply) {
//		this.howto_apply = howto_apply;
//	}
//
//	public String getPost_date() {
//		return post_date;
//	}
//
//	public void setPost_date(String post_date) {
//		this.post_date = post_date;
//	}
//
//	public int getRelocation_assitance() {
//		return relocation_assitance;
//	}
//
//	public void setRelocation_assitance(int relocation_assitance) {
//		this.relocation_assitance = relocation_assitance;
//	}
//
//	public int getTelecommuting() {
//		return telecommuting;
//	}
//
//	public void setTelecommuting(int telecommuting) {
//		this.telecommuting = telecommuting;
//	}
//
//	public ArrayList<Category> getCategory() {
//		return category;
//	}
//
//	public void setCategory(ArrayList<Category> category) {
//		this.category = category;
//	}
//
//	public ArrayList<Type> getType() {
//		return type;
//	}
//
//	public void setType(ArrayList<Type> type) {
//		this.type = type;
//	}
//
//	public ArrayList<Company> getCompany() {
//		return company;
//	}
//
//	public void setCompany(ArrayList<Company> company) {
//		this.company = company;
//	}

//	@Override
//	public String toString() {
//		return "JobReturn [id=" + id + ", title=" + title + ", description=" + description + ", perks=" + perks
//				+ ", howto_apply=" + howto_apply + ", post_date=" + post_date + ", relocation_assitance="
//				+ relocation_assitance + ", telecommuting=" + telecommuting + ", category=" + category + ", type="
//				+ type + ", company=" + company + "]";
//	}
	
	@Override
	public String toString() {
		return "JobReturn [id=" + id + ", title=" + title + ", description=" + description + ", perks=" + perks
				+ ", howto_apply=";
	}
	
}
