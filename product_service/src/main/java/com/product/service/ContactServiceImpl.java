package com.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.product.entity.Contact;
@Service
public class ContactServiceImpl  implements ContactService{
	
	//fake list of contact
	
	List<Contact>list=List.of(
			new  Contact(1,"santosh@123","santosh",1311),
			new  Contact(2,"sameer@123","sameer",1311),
			new  Contact(3,"ramdas@123","ramdas",1312),
			new  Contact(4,"sham@123","sham",1313),
			new  Contact(5,"dada@123","dada",1314)
		);

	@Override
	public List<Contact> getContactsOfUser(Long userid) {
		
		return list.stream().filter(contact-> contact.getUserId()==userid).collect(Collectors.toList());
	}

}
