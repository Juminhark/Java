/*
국어: 80
영어: 60
수학: 100
총점: 240
평균: 80.0
학점: B
 */

package ch04.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0;
		int total = 0;
		double arg = 0.0;
		String grade = "";
		
		System.out.print("국어: ");
		kor = sc.nextInt();sc.nextLine();
		System.out.print("영어: ");
		eng = sc.nextInt();sc.nextLine();
		System.out.print("수학: ");
		math = sc.nextInt();sc.nextLine();
		total = kor+eng+math;
		arg = total/3.0;
		
		if(arg>=90){
			grade = "A";
			/* if(arg>98)grade+="+";
			else if(arg<94)grade+="-";*/
		}else if(arg>=80){
			grade = "B";
			/* if(arg>88)grade+="+";
			else if(arg<84)grade+="-";*/
		}else if(arg>=70){
			grade = "C";
			/* if(arg>78)grade+="+";
			else if(arg<74)grade+="-";*/
		}else grade = "D";
		System.out.printf("총점: %d\n평균: %.1f\n학점: %s",total,arg,grade);
		sc.close();
	}
}
