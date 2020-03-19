package ch08.ex03.case01;

public class Throws {
	public void first(){
		try{
			second();
		}catch(ArithmeticException e){
			System.out.println("first(): Exception.");
		}
	}
		
	public void second() throws ArithmeticException{
		third();
	}
	
	public void third() throws ArithmeticException{
		int i = 3/0;
	}
	
	public static void main(String[] args){
		Throws t = new Throws();
		t.first();
		
	}
}

//throws 메서드 선언부 / exception 발생 할수도 있고 안할수도있다
