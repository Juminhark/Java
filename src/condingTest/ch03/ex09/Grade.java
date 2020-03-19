/* 
 국, 영, 수 점수를 입력 받은 뒤, 총점, 평균, 학점을 출력하라.
 평균 학점
 90점 대 A(100점 포함)
 80점 대 B
 70점 대 C
 나머지 D
 */  

package ch03.ex09;
 
import java.util.Scanner;

public class Grade {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int kor = 0, eng = 0, math = 0;
			int total = 0;
			double avg = 0.0;
			char grade = 0;
			
			System.out.print("국어: ");
			kor = sc.nextInt();sc.nextLine();
			System.out.print("영어: ");
			eng = sc.nextInt();sc.nextLine();
			System.out.print("수학: ");
			math = sc.nextInt();sc.nextLine();
			
			total = kor+eng+math;
			avg = total/3.0;
			
			grade = avg>=90?'A':(avg>=80?'B':(avg>=70?'C':'D')); //상항연산자
			
			System.out.printf("총점: %d, 평균: %.1f, 학점: %s",total,avg,grade);
			sc.close();
	}
}
