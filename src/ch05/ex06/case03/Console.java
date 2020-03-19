package ch05.ex06.case03;

import java.util.Scanner;

public class Console {
	private static Scanner sc = new Scanner(System.in);
	
	//문자열을 입력한다.
	//return: 입력한 문자열
	public static String inStr(){
		return sc.nextLine().trim();
	} //trim은 string class에 있고 앞뒤 빈칸을 날린다.
	
	//숫자를 입력한다.
	//return: 입력한 숫자, -1:문자
	public static int inNum(){
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	//메서지를 출력한다
	//return: 메세지
	public static void info(String msg){
		System.out.println(msg);
	}
	
	//입력 유도 메세지를 출력한다.
	//param:메세지
	public static void inMsg(String msg){
		System.out.print(msg + "\n▶  ");
	}
}
