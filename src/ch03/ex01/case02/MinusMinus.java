package ch03.ex01.case02;

public class MinusMinus {
	public static void main(String[] asrgs){
		int i = 9;
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		i = 9;
		int j = --i;
		System.out.printf("i : %d, j : %d\n", i, j); // i : 8, j : 8
		i = 9;
		j = i--;
		System.out.printf("i : %d, j : %d", i, j); // i : 8, j : 9
	}
}
