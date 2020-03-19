/* 임의의 a, b 변수의 값을 교체하라. */

package condingTest.ch02.ex01.case02;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("a: ");
		int a = sc.nextInt();sc.nextLine();
		System.out.print("b: ");
		int b = sc.nextInt();sc.nextLine();
		System.out.printf("a: %d, b: %d 가 저장되었습니다.\n",a,b);
		
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.printf("a: %d, b: %d  로 교체되었습니다.",a,b);
		sc.close();
	}
}
