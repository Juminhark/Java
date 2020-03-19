package ch07.test.case01.service;

import ch07.test.case01.domain.User;

public class UserServiceEng implements UserService{
	@Override
	public User findUser(){
		return new User("Choi Han Suk");
	}
}
