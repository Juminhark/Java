package ch07.ex01.case10.home.service;

import ch07.ex01.case10.home.domain.User;

public class UserServiceEng implements UserService{
	@Override
	public User findUser(){
		return new User("Choi Han Suk");
	}
}
