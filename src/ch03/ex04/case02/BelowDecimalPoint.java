package ch03.ex04.case02;

public class BelowDecimalPoint {
	public static void main (String[] args){
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10d;
		System.out.println(shortPi); //3.1
		
		shortPi = (int)(pi * 1000) / 1000d;
		System.out.println(shortPi); //3.141
		
		shortPi = Math.round(pi * 1000) / 1000d;
		System.out.println(shortPi); //3.142
	}
}
