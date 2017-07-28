package org.confo.Model;

import java.util.Set;

public class User {
private String userId;
private String userName;
private String mobile;
private String email;
private String md5Password;
private String is_active;
public Set<Role> getRoles() {
	return roles;
}
public void setRoles(Set<Role> roles) {
	this.roles = roles;
}
private Set<Role> roles;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMd5Password() {
	return md5Password;
}
public void setMd5Password(String md5Password) {
	this.md5Password = md5Password;
}
public String getIs_active() {
	return is_active;
}
public void setIs_active(String is_active) {
	this.is_active = is_active;
}

}
