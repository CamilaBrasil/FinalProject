package com.project.Project.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
	private String firstname;
	private String lastname;
	private String email;
	private String zipcode;
	private String password;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FavJobs> favJobsList = new ArrayList<>();

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private Quiz quiz;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String firstname, String lastname, String email, String zipcode, String password,
			List<FavJobs> favJobsList) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.zipcode = zipcode;
		this.password = password;
		this.favJobsList = favJobsList;
	}

	public User(String firstname, String lastname, String email, String zipcode, String password,
			List<FavJobs> favJobsList) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.zipcode = zipcode;
		this.password = password;
		this.favJobsList = favJobsList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List<FavJobs> getFavJobsList() {
		return favJobsList;
	}

	public void setFavJobsList(List<FavJobs> favJobsList) {
		this.favJobsList = favJobsList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", zipcode=" + zipcode + ", password=" + password + ", favJobsList=" + favJobsList + "]";
	}

}
