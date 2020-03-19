/* 정해진 a, b 변수의 값을 교체하라.*/

package ch02.test.case01;

public class Replace {
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int tmp = 0;
		System.out.printf("a : %d, b : %d", a, b);
		System.out.println();
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.printf("a : %d, b : %d", a, b);
	}
}
