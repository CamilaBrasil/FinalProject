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
	@Column(name = "quiz_id")
	private Integer id;
	@Column(name="answer1")
	private Integer answer1;
	@Column(name="answer2")
	private Integer answer2;
	@Column(name="answer3")
	private Integer answer3;
	@Column(name="user_id")
	private Integer userId;
	

	public Quiz() {
		
	}


	public Quiz(Integer id, Integer answer1, Integer answer2, Integer answer3, Integer userId) {
		this.id = id;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.userId = userId;
	}

	public Quiz(Integer answer1, Integer answer2, Integer answer3, Integer userId) {
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.userId = userId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getAnswer1() {
		return answer1;
	}


	public void setAnswer1(Integer answer1) {
		this.answer1 = answer1;
	}


	public Integer getAnswer2() {
		return answer2;
	}


	public void setAnswer2(Integer answer2) {
		this.answer2 = answer2;
	}


	public Integer getAnswer3() {
		return answer3;
	}


	public void setAnswer3(Integer answer3) {
		this.answer3 = answer3;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Skills [id=" + id + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3
				+ ", userId=" + userId + "]";
	}
	
	


	
	

}