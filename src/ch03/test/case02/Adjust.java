/* 파이값 실수 3. 141592를 정수 3.0으로 변환하라. 이항연산자를 이용 */

package ch03.test.case02;

public class Adjust {
	public static void main(String[] args){
		double Fi = 3.141592;
		
		double result = Fi - Fi%1;
		System.out.println(result);
	}
}
