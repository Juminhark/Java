package ch05.ex06.case02;

public class Calc {
	public static int x;
	private int y;
	
	public static void init1(){
		x=1;
		//y=2; //compile error
	}
	
	public void init2(){
		x=1;
		y=2;
	}
}
