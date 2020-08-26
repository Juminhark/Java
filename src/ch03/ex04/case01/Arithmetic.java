package ch03.ex04.case01;

public class Arithmetic {
	public static void main(String[] args){
		byte a = 3;
		byte b = 2;
		 // byte c = a + b ; // compile error : result type is int.
		byte c = (byte)(a+b);
		System.out.println("c : " + c); // c : 5
		
		// c = c+1; // compile error : result type is int.
		c++;            //++단항연산자로서 type 변환이 없다.
		System.out.println("c : " + c); // c : 6
		
		
		double d = a/b;
		System.out.println("d : "+d); // d : 1.0
		
		// good
		d = (double)a/b;
		System.out.println("d : "+d); // d : 1.5
		d = 1.0*a/b;
		System.out.println("d : "+d); // d : 1.5
		
		// bad
		d = (double)(a/b);
		System.out.println("d : "+d); // d : 1.0
		d = a/b*1.0;
		System.out.println("d : "+d); // d : 1.0
	}
}
