package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService{

	
	//fake user list
	
	List<User>list=List.of(new User(1311,"Santosh Honrao","46555456"),
			new User(1312,"sagar yamgar","465558886"),
			new User(1313,"pravin mile ","465588856"),
			new User(1314,"ramdas patil","465588896")
			);
	@Override
	public User getUser(long id) {
		
		
		return this.list.stream().filter(user -> user.getUsreId()==id).findAny().orElse(null);
	}

}
