package com.demo.model;

public class MyUSer {
	private int uid;
	private String uname,pass,role,status;
	public MyUSer() {
		super();
	}
	public MyUSer(int uid, String uname, String pass, String role, String status) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pass = pass;
		this.role = role;
		this.status = status;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MyUSer [uid=" + uid + ", uname=" + uname + ", pass=" + pass + ", role=" + role + ", status=" + status
				+ "]";
	}
	

}
