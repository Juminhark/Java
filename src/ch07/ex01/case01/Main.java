package ch07.ex01.case01;
//polymorphism 다형성
public class Main {
	public static void main(String[] args){
		C c = new C();
		B b = c; //c타입이 b타입으로 프로모션후 대입
		A a = c;
		
		c = (C)a;
		b = (B)a;
		
		c = (C)b;
	}
	
	//객체는 클래스가 있다는뜻
	//객체를 다른 클래스로 변경할때 프로모션, 캐스팅  
}
