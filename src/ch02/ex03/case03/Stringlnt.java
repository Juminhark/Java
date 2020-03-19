package ch02.ex03.case03;

public class Stringlnt {
	public static void main(String[] args){
		int i = 1;
		String str = ""+i;
		System.out.println(str);
		
		str = "1";
		i = Integer.parseInt(str); // string 타입을 정수타입으로 변환
		int result = i + 1;
		System.out.println(result);
	}
}
