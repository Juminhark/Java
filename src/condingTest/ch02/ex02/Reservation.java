/*
공연 관람 일자를 입력하세요.
년: 2018
월: 4
일: 12
2018-04-12자 공연을 예매했습니다.
2018-04-09까지 무료로 환불할수있습니다.
 */
package condingTest.ch02.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("공연 관람 일자를 입력하세요.");
		System.out.print("년: ");
		year = sc.nextInt();sc.nextLine();
		System.out.print("월: ");
		month = sc.nextInt();sc.nextLine();
		System.out.print("일: ");
		day = sc.nextInt();sc.nextLine();
		LocalDate regDate = LocalDate.of(year, month, day);
		
		String concat = regDate+"자 공연을 예매했습니다.";
		System.out.println(concat);
		
		regDate = regDate.minusDays(3);
		String concat1 = regDate+"까지 무료로 환불할수있습니다.";
		System.out.println(concat1);
	}
}
