/*
아이스크림 클래스를 상속받은, 딸기 아이스크림 클래스를 만든다.
아이스크림 클래스엔 이름 멤버 변수가, 딸기 아이스크림 클래스엔 가격 멤버 변수가 있다.
딸기아이스크림을 하나 만들때, 아이스크림 이름과 가격이 준비되어 있다.
super 생성자 호출문을 이용해서, 클래스 디자인을 한다.
 */

package ch06.ex03;

public class StrawBerryIceCream extends IceCream{
	private int price;
	
	public StrawBerryIceCream(String name, int price){
		super(name);
		this.price = price;
	}
	
	public String toString(){
		return String.format("아이스크림: %s, 가격: %d",name,price);
	}
}
