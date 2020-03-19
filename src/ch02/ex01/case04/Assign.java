package ch02.ex01.case04;

public class Assign {
	public static void main(String[] arg){
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b;
		System.out.printf("%d, %d\n", a, b);
		
		a = b+1;
		System.out.printf("%d, %d\n", a, b);
		
		double d = Math.random();
		System.out.printf("%.2f",d);
	}
}
// %d 정수
// %s string
// %.2f 소수점 2쨰자리까지 표시