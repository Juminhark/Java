/* 입력한 문자의 unicode 를 출력하라.*/

package condingTest.ch02.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요. \n>> ");
		char s =sc.nextLine().charAt(0);
		int uni=(int)s;
		System.out.printf("입력하신 %s의 unicode(10진수)는 %d입니다.",s,uni);
	}
}
