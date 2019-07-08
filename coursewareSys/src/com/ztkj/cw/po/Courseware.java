package com.ztkj.cw.po;

import java.util.Date;

public class Courseware {
	private int cwid;
	private String cwname;
	private String cwdescription;
	private String cwdetail;
	private String cwurl;
	private Date cwdate;
	private User user;
	private Subject subject;
	public int getCwid() {
		return cwid;
	}
	public void setCwid(int cwid) {
		this.cwid = cwid;
	}
	public String getCwname() {
		return cwname;
	}
	public void setCwname(String cwname) {
		this.cwname = cwname;
	}
	public String getCwdescription() {
		return cwdescription;
	}
	public void setCwdescription(String cwdescription) {
		this.cwdescription = cwdescription;
	}
	public String getCwdetail() {
		return cwdetail;
	}
	public void setCwdetail(String cwdetail) {
		this.cwdetail = cwdetail;
	}
	public Date getCwdate() {
		return cwdate;
	}
	public void setCwdate(Date cwdate) {
		this.cwdate = cwdate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getCwurl() {
		return cwurl;
	}
	public void setCwurl(String cwurl) {
		this.cwurl = cwurl;
	}
}
