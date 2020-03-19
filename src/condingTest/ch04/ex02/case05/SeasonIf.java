/*
월? 3
3월은 봄입니다.
 */

package ch04.ex02.case05;

import java.util.Scanner;

public class SeasonIf {
	public static void main(String[] args){
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월? ");
		month = sc.nextInt();
		
		if(1<=month && month<=2)season = "겨울";
		else if(3<=month && month<=5)season = "봄";
		else if(6<=month && month<=8)season = "여름";
		else if(7<=month && month<=11)season = "가을";
		else if(12<=month)season = "겨울";
		
		System.out.printf("%d월은 %s입니다.",month,season);
		
		sc.close();
	}
}
