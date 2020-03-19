package ch08.ex02.case01;

public class Hierarchy {
	public void first(){
		try{
			int i = 3/0;
		}catch(ArithmeticException e){
			System.out.println("first: ArithmeticException.");
		}catch(RuntimeException e){
			System.out.println("first: RuntimeException.");
		}catch(Exception e){
			System.out.println("first: Exception.");
		}
	}
	
	public void second(){
		try{
			int i = 3/0;
		}catch(Exception e){
			System.out.println("second: Exception.");
		}
	}
}
