package ch06.ex04.case05;

public class TestMain {
	public static void main(String[] args){
		Shoes shoes = new Shoes(10_000);
		System.out.println(shoes.getPrice());
	} //shoes.getPrice(shoes) 주어의 데이터타입이 파라미터의 데이터타입으로 들어가
	                                       //shoes가 product로 promotion
}
