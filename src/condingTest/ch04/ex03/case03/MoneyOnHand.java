/*
3만원짜리 물건을 사려한다.
지갑에서 지폐를 한장씩 꺼내서, 손에 쥐어라.
5만원권 지폐는 없다고 가정한다.
*/

package ch04.ex03.case03;

public class MoneyOnHand {
	public static void main(String[] args){			
		int money = 0; //hand에서 꺼낸 모든 현금		
		int hand = 0; // 천원, 오천원, 만원중에 지폐 1장만 꺼냈을때		
		int one = 0; // 지폐 1장은 랜덤		
				
		while(money<30000){		
			one=(((int)(Math.random()*10)+1)%3)+1;	
			switch(one){	
			case 1: hand=1000; break;	
			case 2: hand=5000; break;	
			case 3: hand=10000;}	
			System.out.println(hand+"원을 꺼냈습니다.");	
			money +=hand;	
		}		
		System.out.printf("손에 %d원을 쥐었습니다.",money);		
	}			
}
