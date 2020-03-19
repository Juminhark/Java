package ch07.ex01.case05;

public class Main {
	public static void main(String[] args){
		Car car = new FireEngine();
		car.drive();
		
		//car.water(); //compile error
		FireEngine fireEngine = ((FireEngine)car);
		fireEngine.water();
		fireEngine.drive();
		
		((Car)fireEngine).drive();
		
		//class 프로모션은 크기와 관계없이 scope이랑 관련
	}
}
