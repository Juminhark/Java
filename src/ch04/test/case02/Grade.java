/* 국영수 점수를 입력 받은 뒤, 총점, 평균, 학점을 출력하라.
 * 90점대 A
 * 80점대 B
 * 70점대 C
 * 나머지 D
 * 
 * 국어 : 90
 * 영어 : 80
 * 수학 : 70
 * 총점 : 240
 * 평균 : 80.0
 * 등급 : B
 */

package condingTest.ch04.case02;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0;
		int total = 0;
		
		System.out.print("국어 : ");
		kor = sc.nextInt(); sc.nextLine();
		System.out.print("영어 : ");
		eng = sc.nextInt(); sc.nextLine();	
		System.out.print("수학 : ");
		math = sc.nextInt(); sc.nextLine();	
		total = kor+eng+math;
		double arg = (kor+eng+math)/3;
		
		String grade = "";
		
		if(arg>=90){
			grade = "A";
			/*if(arg>=98)grade+="+";
			else if(arg<94)grade+="-";*/
		}else if(arg>=80){
			grade = "B";
			/*if(arg>=88)grade+="+";
			else if(arg<84)grade+="-";*/
		}else if(arg>=70){
			grade = "C";
			/*if(arg>=78)grade+="+";
			else if(arg<74)grade+="-";*/
		}else grade = "D";
		
		System.out.printf("총점 : %d\n평균 : %.1f\n학점 : %s",total,arg,grade);
	}
}