package ch02.ex02.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class C03 {
	public static void main(String[] args){
		LocalDate localDate = LocalDate.of(2017, 2, 7);
		int year = localDate.getYear();
		int dayOfYear = localDate.getDayOfYear();
		int dayOfMonth = localDate.getDayOfMonth();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		Month month = localDate.getMonth();
		int monthValue = localDate.getMonthValue();
		boolean leap = localDate.isLeapYear();
			
		System.out.println(year); //2017
		System.out.println(dayOfYear); //38 (년 기준으로 38일째)
		System.out.println(dayOfMonth); // 7 (달기준으로 7일째)
		System.out.println(dayOfWeek); // TUESDAY
		System.out.println(month); // FEBRUARY
		System.out.println(monthValue); //2
		System.out.println(leap); //false (윤년 여부)
	}
}
