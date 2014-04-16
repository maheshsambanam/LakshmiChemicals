package com.lakshmi.chemicals.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// Entity name for the user table
@Entity
@Table(name = "user")
@SecondaryTable(name = "admin_user_credentials", pkJoinColumns = @PrimaryKeyJoinColumn(name = "admin_id", referencedColumnName = "user_id"))
public class User {

	// auto-Id key value
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	@Column(name = "email_address")
	private String emailAddress;
	@Column(name = "phone")
	private String phoneNumber;
	@Column(name = "address")
	private String address;
	@Column(name = "vat_tin_number")
	private String vatNumber;
	@Column(name = "ce_reg_no")
	private String ceRegNo;
	@Column(name = "ranges")
	private String range;
	@Column(name = "division")
	private String division;
	@Column(name = "commision_rate")
	private String commisionRate;
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType userType;
	@Column(name="member_from")
	@Temporal(TemporalType.DATE)
	private Date memberFrom;
	@Column(table = "admin_user_credentials", name = "username")
	private String userName;
	@Column(table = "admin_user_credentials", name = "password")
	private String password;
	@Column(table = "admin_user_credentials", name = "master_key")
	private String masterKey;

	// Getters and Setters

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCeRegNo() {
		return ceRegNo;
	}

	public void setCeRegNo(String ceRegNo) {
		this.ceRegNo = ceRegNo;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(String commisionRate) {
		this.commisionRate = commisionRate;
	}

	
	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMasterKey() {
		return masterKey;
	}

	public void setMasterKey(String masterKey) {
		this.masterKey = masterKey;
	}

	public Date getMemberFrom() {
		return memberFrom;
	}

	public void setMemberFrom(Date memberFrom) {
		this.memberFrom = memberFrom;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailAddress=" + emailAddress
				+ ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", vatNumber=" + vatNumber + ", ceRegNo=" + ceRegNo
				+ ", range=" + range + ", division=" + division
				+ ", commisionRate=" + commisionRate + ", userType=" + userType
				+ ", memberFrom=" + memberFrom + ", userName=" + userName
				+ ", password=" + password + ", masterKey=" + masterKey + "]";
	}
	
	
	

}
