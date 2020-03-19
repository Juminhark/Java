package ch04.ex02;

import java.util.Scanner;

public class Presont {	
	public static void main(String[] args){			
		Scanner sc = new Scanner(System.in);		
		System.out.printf("1.냉장고,  2.세탁기\n>> ");		
		int mainChoice = sc.nextInt();sc.nextLine();		
		int subChoice = 0;		
		String prize = "";		
		String brand = "";		
				
		//if에서는 다양한 연산을 비교해볼수 있고 switch에서는 이퀄만		
		switch(mainChoice){		
		case 1:		
			prize = "냉장고";	
			System.out.printf("1.삼성  2.LG  3.대우\n>> ");	
			subChoice = sc.nextInt(); sc.nextLine();	
			switch(subChoice){	
			case 1:brand = "삼성"; break;	
			case 2:brand = "LG"; break;	
			case 3:brand = "대우"; break;	
			}	
			break;	
		case 2:		
			prize = "세탁기";	
			System.out.printf("1.삼성,  2.LG, 3.대우\n>> ");	
			subChoice = sc.nextInt(); sc.nextLine();	
			switch(subChoice){	
			case 1:brand = "삼성"; break;	
			case 2:brand = "LG"; break;	
			case 3:brand = "대우"; break;	
			}	
			break;	
		default:prize = "뽀삐 화장기";		
		}						
		prize = brand + prize;		
		System.out.println(prize + "를 드립니다.");		
					
		sc.close();						
	}				
}
