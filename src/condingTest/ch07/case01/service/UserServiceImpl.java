package ch07.test.case01.service;

import ch07.test.case01.dao.UserDao;
import ch07.test.case01.domain.User;

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
