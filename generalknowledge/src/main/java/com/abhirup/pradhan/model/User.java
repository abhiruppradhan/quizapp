package com.abhirup.pradhan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String user_Email;
	private String user_FirstName;
	private String user_LastName;
	private String user_Gender;
	private String user_City;
	private String user_Country;
	private String user_Password;
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public String getUser_FirstName() {
		return user_FirstName;
	}
	public void setUser_FirstName(String user_FirstName) {
		this.user_FirstName = user_FirstName;
	}
	public String getUser_LastName() {
		return user_LastName;
	}
	public void setUser_LastName(String user_LastName) {
		this.user_LastName = user_LastName;
	}
	public String getUser_Gender() {
		return user_Gender;
	}
	public void setUser_Gender(String user_Gender) {
		this.user_Gender = user_Gender;
	}
	public String getUser_City() {
		return user_City;
	}
	public void setUser_City(String user_City) {
		this.user_City = user_City;
	}
	public String getUser_Country() {
		return user_Country;
	}
	public void setUser_Country(String user_Country) {
		this.user_Country = user_Country;
	}
	public String getUser_Password() {
		return user_Password;
	}
	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}
	
}
