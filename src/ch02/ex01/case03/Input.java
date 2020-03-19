package ch02.ex01.case03;

import java.util.Scanner;

public class Input {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력 : ");
		String s = sc.nextLine();
		System.out.println(s+"를 입력");
		
		System.out.print("숫자를 입력 : ");
		int a = sc.nextInt();sc.nextLine();
		System.out.println(a+"를 입력");
		
		System.out.print("문자열을 입력 : ");
		s = sc.nextLine();
		System.out.println(s+"를 입력");
		
		System.out.print("문자열을 입력 : ");
		char c = sc.nextLine().charAt(0);
		System.out.println("입력된 문자열의 첫글자 : "+ c );
		
		sc.close();
	}
}
