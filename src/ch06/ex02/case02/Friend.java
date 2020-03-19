package ch06.ex02.case02;

public class Friend {
	public void play(){
		Parent parent = new Parent();
		//parent.getJuminNum(); //private //compile error
		parent.getName();       //public
		parent.getWealth();     //protected
		parent.addMoney(1000);  //default
	}
}
