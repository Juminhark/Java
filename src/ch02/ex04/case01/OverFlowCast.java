package ch02.ex04.case01;

public class OverFlowCast {
	public static void main(String[] args){
		byte b = 10;
		int i = b;
		i = (int)b;
		System.out.println(i); //10
		
		int i2 = 300;
		byte b2 =(byte)i2;
		System.out.println(b2); //44
	}
}
