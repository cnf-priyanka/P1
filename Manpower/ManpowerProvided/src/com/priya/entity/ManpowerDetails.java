package com.priya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MANPOWERDETAILS")
public class ManpowerDetails {
@Id
@Column(name="ID")
@GeneratedValue
private Integer id;

@Column(name="NAME")
private String name;

@Column(name="DESIGNATION")
private String designation;

@Column(name="EMAIL")
private String email;

@Column(name="PHONE")
private String phone;

@Column(name="STATE")
private String state;

@Column(name="DISTRICT")
private String district;

@Column(name="PO_ORDER")
private String poorder;

@Column(name="VENDOR")
private String vendor;

@Temporal(TemporalType.DATE)
@Column(name="DATE_OF_JOINING")
private Date dateofJoining;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getDistrict() {
	return district;
}

public void setDistrict(String district) {
	this.district = district;
}

public String getPoorder() {
	return poorder;
}

public void setPoorder(String poorder) {
	this.poorder = poorder;
}

public String getVendor() {
	return vendor;
}

public void setVendor(String vendor) {
	this.vendor = vendor;
}

public Date getDateofJoining() {
	return dateofJoining;
}

public void setDateofJoining(Date dateofJoining) {
	this.dateofJoining = dateofJoining;
}

@Override
public String toString() {
	return "ManpowerDetails [id=" + id + ", name=" + name + ", designation="
			+ designation + ", email=" + email + ", phone=" + phone
			+ ", state=" + state + ", district=" + district + ", poorder="
			+ poorder + ", vendor=" + vendor + ", dateofjoining=" + dateofJoining +
			"]";
}



}
