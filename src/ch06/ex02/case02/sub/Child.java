package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent{
	public void play(){
		//int juminNum = getJuminNum(); //private //compile error
		getName();                      //public
		getWealth();                    //protected
		//addMoney(1000);               //default //compile error
	}

}
