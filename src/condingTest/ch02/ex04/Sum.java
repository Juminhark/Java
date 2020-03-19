/* 입력 받은 두수의 합계를 구하라. */

package condingTest.ch02.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		System.out.print("a: ");
		a = sc.nextDouble();sc.nextLine();
		System.out.print("b: ");
		b = sc.nextDouble();sc.nextLine();
		
		c = a + b;
		System.out.printf("%.0f + %.0f = %.0f",a,b,c);
	}
}
