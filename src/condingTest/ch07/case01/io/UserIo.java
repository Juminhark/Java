package ch07.test.case01.io;

import ch07.test.case01.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService){
		this.userService = userService;
	}
	
	public void display(){
		System.out.println(userService.findUser());
	}
}
