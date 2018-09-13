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
	@Column(name = "user_id")
	private Integer id;
	@Column(name = "years_exp")
	private String yearsExp;
	private String education;
	private String type;
	private String size;
	private String location;
	private String softwaredevelopment;
	private String html;
	private String css;
	private String javascript;
	private String java;
	private String wordpress;
	private String androiddevelopment;
	private String iosdevelopment;
	private String php;
	private String sqldatabases;
	@Column(name = "c++")
	private String c;
	private String webdesign;
	private String angular;
	private String react;
	private String writtencommunication;
	private String verbalcommunication;

//	@OneToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "user_id", nullable = false)
//	private User user;

	public Quiz() {
	}

	public Quiz(Integer id, String yearsExp, String education, String type, String size, String location,
			String softwaredevelopment, String html, String css, String javascript, String java, String wordpress,
			String androiddevelopment, String iosdevelopment, String php, String sqldatabases, String c,
			String webdesign, String angular, String react, String writtencommunication, String verbalcommunication) {
		super();
		this.id = id;
		this.yearsExp = yearsExp;
		this.education = education;
		this.type = type;
		this.size = size;
		this.location = location;
		this.softwaredevelopment = softwaredevelopment;
		this.html = html;
		this.css = css;
		this.javascript = javascript;
		this.java = java;
		this.wordpress = wordpress;
		this.androiddevelopment = androiddevelopment;
		this.iosdevelopment = iosdevelopment;
		this.php = php;
		this.sqldatabases = sqldatabases;
		this.c = c;
		this.webdesign = webdesign;
		this.angular = angular;
		this.react = react;
		this.writtencommunication = writtencommunication;
		this.verbalcommunication = verbalcommunication;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getYearsExp() {
		return yearsExp;
	}

	public void setYearsExp(String yearsExp) {
		this.yearsExp = yearsExp;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSoftwaredevelopment() {
		return softwaredevelopment;
	}

	public void setSoftwaredevelopment(String softwaredevelopment) {
		this.softwaredevelopment = softwaredevelopment;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getJavascript() {
		return javascript;
	}

	public void setJavascript(String javascript) {
		this.javascript = javascript;
	}

	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public String getWordpress() {
		return wordpress;
	}

	public void setWordpress(String wordpress) {
		this.wordpress = wordpress;
	}

	public String getAndroiddevelopment() {
		return androiddevelopment;
	}

	public void setAndroiddevelopment(String androiddevelopment) {
		this.androiddevelopment = androiddevelopment;
	}

	public String getIosdevelopment() {
		return iosdevelopment;
	}

	public void setIosdevelopment(String iosdevelopment) {
		this.iosdevelopment = iosdevelopment;
	}

	public String getPhp() {
		return php;
	}

	public void setPhp(String php) {
		this.php = php;
	}

	public String getSqldatabases() {
		return sqldatabases;
	}

	public void setSqldatabases(String sqldatabases) {
		this.sqldatabases = sqldatabases;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getWebdesign() {
		return webdesign;
	}

	public void setWebdesign(String webdesign) {
		this.webdesign = webdesign;
	}

	public String getAngular() {
		return angular;
	}

	public void setAngular(String angular) {
		this.angular = angular;
	}

	public String getReact() {
		return react;
	}

	public void setReact(String react) {
		this.react = react;
	}

	public String getWrittencommunication() {
		return writtencommunication;
	}

	public void setWrittencommunication(String writtencommunication) {
		this.writtencommunication = writtencommunication;
	}

	public String getVerbalcommunication() {
		return verbalcommunication;
	}

	public void setVerbalcommunication(String verbalcommunication) {
		this.verbalcommunication = verbalcommunication;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", yearsExp=" + yearsExp + ", education=" + education + ", type=" + type + ", size="
				+ size + ", location=" + location + ", softwaredevelopment=" + softwaredevelopment + ", html=" + html
				+ ", css=" + css + ", javascript=" + javascript + ", java=" + java + ", wordpress=" + wordpress
				+ ", androiddevelopment=" + androiddevelopment + ", iosdevelopment=" + iosdevelopment + ", php=" + php
				+ ", sqldatabases=" + sqldatabases + ", c=" + c + ", webdesign=" + webdesign + ", angular=" + angular
				+ ", react=" + react + ", writtencommunication=" + writtencommunication + ", verbalcommunication="
				+ verbalcommunication + "]";
	}

}