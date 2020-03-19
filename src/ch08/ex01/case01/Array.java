package ch08.ex01.case01;

public class Array {
	public static void main(String[] args){
		int[] array = new int[10];
		int result = array[10];
		System.out.println("end.");
	}
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at ch08.ex01.case01.Array.main(Array.java:6)
 */ 
