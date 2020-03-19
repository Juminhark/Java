/* 임의의 a, b 변수의 값을 교체하라*/

package ch02.test.case02;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=0, b=0, tmp=0;
		
		System.out.print("a를 입력 : ");
		a = sc.nextInt(); sc.nextLine();
		System.out.print("b를 입력 : ");
		b = sc.nextInt(); sc.nextLine();
		System.out.printf("a = %d, b = %d 를 입력하였습니다.",a,b);
		System.out.println();
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.printf("a = %d, b = %d 로 교체되었습니다.",a,b);	
		sc.close();
	}
}
