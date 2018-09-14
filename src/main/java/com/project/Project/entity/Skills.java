package com.project.Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skills_id")
	private Integer id;
	@Column(name="skills")
	private String skills;
	@Column(name="user_id")
	private Integer userId;
	

	public Skills() {
	}
	
	public Skills(String skills) {
		super();
		this.skills = skills;
	}

	public Skills(Integer id, String skills) {
		super();
		this.id = id;
		this.skills = skills;
	}
	
	public Skills(String skills, Integer userId) {
		super();
		this.skills = skills;
		this.userId = userId;
	}
	
	public Skills(Integer id, String skills, Integer userId) {
		super();
		this.id = id;
		this.skills = skills;
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUser_id(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", skills=" + skills + ", user_id=" + userId + "]";
	}


	
	

}