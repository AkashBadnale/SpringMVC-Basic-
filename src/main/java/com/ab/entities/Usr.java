package com.ab.entities;

public class Usr {

	private String uname;
	private String pwd;
	public Usr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usr(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Usr [uname=" + uname + ", pwd=" + pwd + "]";
	}
	
	
}//Usr
