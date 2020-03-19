package ch07.test.case01;

import ch07.test.case01.dao.UserDao;
import ch07.test.case01.dao.UserDaoImpl;
import ch07.test.case01.io.UserIo;
import ch07.test.case01.service.UserService;
import ch07.test.case01.service.UserServiceImpl;

public class Main {
	public static void main(String[] args){
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.display(); //최한석
	}
}
