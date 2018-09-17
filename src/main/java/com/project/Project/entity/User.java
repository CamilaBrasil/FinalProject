package com.project.Project.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
	private String firstname;
	private String lastname;
	private String email;
	private String zipcode;
	private String password;

//	@OneToMany//(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//	@JoinColumn(name="user_id")
//	private List<FavJobs> favJobsList = new ArrayList<>();
	
	@OneToMany()
	@JoinColumn(name="user_id")
	private Set<FavJobs> favJobs;
	
	@OneToMany()
	@JoinColumn(name="user_id")
	private Set<Quiz> skills;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

public User(Integer user_id, String firstname, String lastname, String email, String zipcode, String password,
		Set<FavJobs> favJobs, Set<Quiz> skills) {
	super();
	this.user_id = user_id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.zipcode = zipcode;
	this.password = password;
	this.favJobs = favJobs;
	//this.skills = skills;
}

public Integer getUser_id() {
	return user_id;
}

public void setUser_id(Integer user_id) {
	this.user_id = user_id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Set<FavJobs> getFavJobs() {
	return favJobs;
}

public void setFavJobs(Set<FavJobs> favJobs) {
	this.favJobs = favJobs;
}

//public Set<Skills> getSkills() {
//	return skills;
//}
//
//public void setSkills(Set<Skills> skills) {
//	this.skills = skills;
//}

@Override
public String toString() {
	return "User [user_id=" + user_id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
			+ ", zipcode=" + zipcode + ", password=" + password + ", favJobs=" + favJobs + ", skills="  + "]"; //+ skills
}

	

}
