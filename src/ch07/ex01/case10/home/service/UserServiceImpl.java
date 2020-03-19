package ch07.ex01.case10.home.service;

import ch07.ex01.case10.home.dao.UserDao;
import ch07.ex01.case10.home.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao){
		this.userDao = userDao; 
	}
	
	@Override
	public User findUser(){
		//업무처리 내용
		User user = userDao.getUser();
		//업무처리 내용
		return user;
	}
}
