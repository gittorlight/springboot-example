package com.github.torlight.sbex;

import org.springframework.beans.factory.annotation.Autowired;

public class UserAction {
	
	@Autowired
	private User user;
	
	public void sysOutUserInfo(){
		System.err.println("user info name="+user.getName() +", age="+user.getAge());
	}
}
