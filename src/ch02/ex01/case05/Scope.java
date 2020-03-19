package ch02.ex01.case05;

public class Scope {
	public static void main(String[] arg){
		int i = 0;
		
		int j = 0;
		{
			// int i = 0; 상위 scope에 i가 이미 존재
			int x = 0;
			int y = 0;
		}
		int x= 0;
	}
}
