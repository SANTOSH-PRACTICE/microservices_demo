package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private long usreId;
	private String name;
	private String phone;
	
	List<Contact>contacts=new ArrayList<Contact>();
	public User(long usreId, String name, String phone) {
		super();
		this.usreId = usreId;
		this.name = name;
		this.phone = phone;
	}
	public User(long usreId, String name, String phone, List<Contact> contacts) {
		super();
		this.usreId = usreId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	public User() {
	}
	public long getUsreId() {
		return usreId;
	}
	public void setUsreId(long usreId) {
		this.usreId = usreId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "User [usreId=" + usreId + ", name=" + name + ", phone=" + phone + "]";
	}
	

}
