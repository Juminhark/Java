package ch07.test.case01.dao;

import ch07.test.case01.domain.User;

public class UserDaoImpl implements UserDao{
	@Override
	public User getUser(){
		return new User("최한석");
	}
}
