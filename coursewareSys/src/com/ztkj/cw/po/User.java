package com.ztkj.cw.po;

import java.util.Date;


public class User {
	private int userid;
	private String username;
	private String pwd;
	private String rname;
	private String gender;
	private String cellphone;
	private String address;
	private Date birthday;
	private int age;
	private Role role;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", pwd=" + pwd + ", rname=" + rname + ", gender="
				+ gender + ", cellphone=" + cellphone + ", address=" + address + ", birthday=" + birthday + ", age="
				+ age + ", role=" + role + "]";
	}

}
