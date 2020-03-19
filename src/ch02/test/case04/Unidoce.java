/* 입력한 문자의 unicode를 출력하라 */

package ch02.test.case04;

import java.util.Scanner;

public class Unidoce {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요. : ");
		String s = sc.nextLine();
		char s1 = s.charAt(0);
		int s2 =(int)s1; //행변환 숙지
		
		System.out.printf("입력하신 %s 의 unicode(10진수)는 %s 입니다.",s,s2);	
		sc.close();
	}
}
