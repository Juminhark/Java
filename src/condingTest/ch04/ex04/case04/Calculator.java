/*
숫자 2가 연산자 1개를 입력받아 산술 연산을 하라.
숫자 1: 6
(+,-,*,/) : /
숫자 2: 2
6/2=3
계속(y/n)? n
끝
*/

package ch04.ex04.case04;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){				
		Scanner sc = new Scanner(System.in);			
					
		int target =0; //숫자 1			
		String operator = "";//연산자			
		int ope = 0;			
		int target2 = 0; //숫자 2			
		int result = 0;			
		char end = 0;			
					
		do{			
			System.out.print("숫자 1: ");		
			target = sc.nextInt();sc.nextLine();		
					
			System.out.print("(+,-,*,/): ");		
			operator = sc.nextLine();		
			if(operator.equals("+")) ope=1;		
			else if(operator.equals("-")) ope=2;		
			else if(operator.equals("*")) ope=3;		
			else if(operator.equals("/")) ope=4;		
					
			System.out.print("숫자 2: ");		
			target2 = sc.nextInt();sc.nextLine();		
					
			switch(ope){		
			case 1:result = target+target2; break;		
			case 2:result = target-target2; break;		
			case 3:result = target*target2; break;		
			case 4:result = target/target2; break;}		
					
			System.out.printf("%d %s %d = %d",target,operator,target2,result);		
			System.out.println();		
					
			System.out.print("계속(y/n)? ");		
			end = sc.nextLine().charAt(0);		
		}while(end != 'n');			
		System.out.println("끝.");			
					
		sc.close();			
	}				
}
