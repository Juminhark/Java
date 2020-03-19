package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Friend {
	public void play(){
		Parent parent = new Parent();
		//parent.getJuminNum(); //private    //compile error
		parent.getName();       //public
		//parent.getWealth();   //protected  //compile error
		//parent.addMoney(1000);//default    //compile error
	}
}
