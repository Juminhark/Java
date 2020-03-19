/*
자바에서 준비한 접근 제한자 4개

private    현장에서 많이 쓰인다
public     현장에서 많이 쓰인다
default    package가 스콥
protected  package가 스콥 + 다른 package라도 자식 클래스면 볼수 있다.

*/

package ch06.ex02.case02;

public class Parent {
	private int juminNum;   //주민등록번호
	private String name;    //이름
	private int wealth;     //재산액
	
	private int getJuminNum(){
		return juminNum;
	}
	
	public String getName(){
		return name;
	}
	
	protected int getWealth(){
		return wealth;
	}
	
	void addMoney(int money){
		this.wealth += money;
	}
}
