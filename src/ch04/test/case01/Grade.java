/* 국, 영, 수 점수를 입력 받은 뒤, 총점, 평균, 학점을 출력하라.
 * 평균 학점
 * 90점대 A (100점 포함)
 * 80점대 B
 * 70점대 C
 * 나머지 D
 */

package condingTest.ch04.case01;

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
			char grade = (arg >= 90d) ? 'A' : ((arg >= 80d)? 'B' : ((arg >= 70d) ? 'C' : 'D'));
			System.out.printf("총점 : %d, 평균 : %.1f, 학점 : %s",total,arg,grade);
			
		}
}
