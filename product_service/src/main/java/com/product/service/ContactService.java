package com.product.service;

import java.util.List;

import com.product.entity.Contact;

public interface ContactService {
	
	public List<Contact>getContactsOfUser(Long userid);

}
