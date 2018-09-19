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
	private String answer1;
	@Column(name="answer2")
	private String answer2;
	@Column(name="answer3")
	private String answer3;
	@Column(name="answer4")
	private String answer4;
	@Column(name="answer5")
	private String answer5;
	@Column(name="answer6")
	private String answer6;
	@Column(name="user_id")
	private Integer userId;
	

	public Quiz() {
		
	}


	public Quiz(Integer id, String answer1, String answer2, String answer3, String answer4, String answer5,
			String answer6, Integer userId) {
		super();
		this.id = id;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.answer6 = answer6;
		this.userId = userId;
	}


	public Quiz(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6,
			Integer userId) {
		super();
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.answer6 = answer6;
		this.userId = userId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAnswer1() {
		return answer1;
	}


	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}


	public String getAnswer2() {
		return answer2;
	}


	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}


	public String getAnswer3() {
		return answer3;
	}


	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}


	public String getAnswer4() {
		return answer4;
	}


	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}


	public String getAnswer5() {
		return answer5;
	}


	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}


	public String getAnswer6() {
		return answer6;
	}


	public void setAnswer6(String answer6) {
		this.answer6 = answer6;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Quiz [id=" + id + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3
				+ ", answer4=" + answer4 + ", answer5=" + answer5 + ", answer6=" + answer6 + ", userId=" + userId + "]";
	}



	

}