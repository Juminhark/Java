/*
1부터 99까지 369게임을 진행하라.

33 짝짝
*/

package ch04.ex04.case05;

public class Thress69 {
	public static void main(String[] args){				
		int first = 0; // 십의 자리 숫자			
		int second = 0; //일의 자리 숫자			
					
		for(int i=1;i<100;i++){			
			first = i/10;		
			second = i%10;		
			System.out.print(" " + i);		
			if(first!=0 && first%3==0) System.out.print("짝");		
			if(second!=0 && second%3==0) System.out.print("짝");		
			if(i%10==00) System.out.println();		
			}		
	}				
}
