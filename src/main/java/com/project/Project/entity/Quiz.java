package com.project.Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="quiz_id")
	private Integer id;
	@Column(name = "years_exp")
	private String yearsExp;
	private String education;
	private String skills;
	private String type;
	private String size;
	private String location;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public Quiz() {
	}

	public Quiz(String yearsExp, String education, String skills, String type, String size, String location) {
		this.yearsExp = yearsExp;
		this.education = education;
		this.skills = skills;
		this.type = type;
		this.size = size;
		this.location = location;
	}

	public Quiz(Integer id, String yearsExp, String education, String skills, String type, String size,
			String location) {
		this.id = id;
		this.yearsExp = yearsExp;
		this.education = education;
		this.skills = skills;
		this.type = type;
		this.size = size;
		this.location = location;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the yearsExp
	 */
	public String getYearsExp() {
		return yearsExp;
	}

	/**
	 * @param yearsExp the yearsExp to set
	 */
	public void setYearsExp(String yearsExp) {
		this.yearsExp = yearsExp;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", yearsExp=" + yearsExp + ", education=" + education + ", skills=" + skills
				+ ", type=" + type + ", size=" + size + ", location=" + location + ", user=" + user + "]";
	}

}
