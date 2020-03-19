/* 알파고와 가위바위보를 하라.				
*				
* 1. 가위 2. 바위 3.보				
* >>1				
* 당 신 : 가위				
* 알파고 : 보				
* 당신이 이겼습니다.				
*/				
package ch04.ex02.case06;

import java.util.Scanner;

public class KawibawiboIf {
				
	public static void main(String[] args){			
		System.out.println("알파고와 가위바위보를 하라.");		
		Scanner sc = new Scanner(System.in);		
		System.out.printf("1.가위 2.바위 3.보\n>> ");		
		int youChoice = sc.nextInt();sc.nextLine();		
		int alpagoChoice = 0;		
		String you = "";		
		String alpago = "";		
		String outcome = "";		
				
		if(youChoice == 1) you = "가위";		
		else if(youChoice == 2) you = "바위";		
		else if(youChoice == 3) you = "보";		
		else you = "잘못입력되었습니다.";		
		System.out.println("당  신 : "+you);		
				
		alpagoChoice = ((int)(Math.random()*10)+1)%3;		
				
		if(alpagoChoice == 1) alpago = "가위";		
		else if(alpagoChoice == 2)alpago = "바위";		
		else alpago = "보";		
		System.out.println("알파고 : "+alpago);		
				
		if(youChoice == alpagoChoice) outcome = "당신과 알파고가 비겼습니다.";		
		else if(youChoice+2 == alpagoChoice)outcome = "당신이 이겼습니다.";		
		else if(youChoice+1 == alpagoChoice)outcome = "당신이 졌습니다.";		
		else if(youChoice-1 == alpagoChoice)outcome = "당신이 이겼습니다.";		
		else /*if(youChoice-2 == alpagoChoice)*/outcome = "당신이 졌습니다.";		
		System.out.println(outcome); //business logic		
				
		sc.close();		
	}			
}				