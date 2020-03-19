/* 두수를 입력받아, 그 합계를 구하라. 
  a:1
  b:2
  1+2=3
 */

package ch03.test.case01;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=0, b=0;
		
		System.out.print("a : ");
		a = sc.nextInt();sc.nextLine();
		System.out.print("b : ");
		b = sc.nextInt();sc.nextLine();	
		
		int SUM = a+b;
		System.out.printf("%d + %d = %d",a,b,SUM);
		sc.close();
	}
}
