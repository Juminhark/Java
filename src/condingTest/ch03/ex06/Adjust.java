/* 파이값 실수 3.141592를 정수 3.0으로 변환하라. 이항연산자를 이용 */

package ch03.ex06;

public class Adjust {
	public static void main(String[] args){
		double f = 0.0;
		double result = 0.0;
		
		f = 3.141592;
		result = f-f%1;
		System.out.println(result);
		
		/*
		 double shorf = (int)(f*10)/10d;
		 shorf = Math.round(shorf);
		 System.out.printf("%.1f",shorf);
		 */
		/*
		 double remain=f%10;
		 double shorf = Math.round(remain);
		 System.out.printf("%.1f",shorf);
		 */
	}
}
