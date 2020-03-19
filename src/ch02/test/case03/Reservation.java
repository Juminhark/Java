/* 공연 관람 일자를 입력하세요*/

package ch02.test.case03;

import java.util.Scanner;
import java.time.LocalDate;

public class Reservation {
	public static void main(String[] args){
		System.out.println("공연 관람 일자를 입력하세요.");
		int year=0, month=0, date=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년 : ");
		year = sc.nextInt(); sc.nextLine();
		System.out.print("월 : ");
		month = sc.nextInt(); sc.nextLine();
		System.out.print("일 : ");
		date = sc.nextInt(); sc.nextLine();
		
		LocalDate localDate = LocalDate.of(year,month,date); //localdate 쓰는 방법 숙달.
		System.out.println(localDate+"자 공연을 예매했습니다.");
		
		localDate = localDate.minusDays(3);
		System.out.println(localDate+"까지 무료로 환불가능합니다");
		sc.close();
	}
}
