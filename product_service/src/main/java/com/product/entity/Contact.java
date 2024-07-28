package com.product.entity;

public class Contact {
	
	private long cId;
	private String email;
	private String cName;
	private long userId;
	public Contact(long cId, String email, String cName, long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.cName = cName;
		this.userId = userId;
	}
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Contact [cId=" + cId + ", email=" + email + ", cName=" + cName + ", userId=" + userId + "]";
	}
	

}

