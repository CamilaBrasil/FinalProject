package com.project.Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skills_id")
	private Integer id;
	private String skills;

//	@OneToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "user_id", nullable = false)
//	private User user;

	public Quiz() {
	}

	public Quiz(Integer id, String skills) {
		super();
		this.id = id;
		this.skills = skills;
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

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", skills=" + skills + "]";
	}
	
	

}