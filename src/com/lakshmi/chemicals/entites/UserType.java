package com.lakshmi.chemicals.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_type")
public class UserType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_type_id")
	private int id;
	@Column(name="user_type")
	private String userType;
	

	
	//Getters and Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "UserType [id=" + id + ", userType=" + userType + "]";
	}
	
	
}
