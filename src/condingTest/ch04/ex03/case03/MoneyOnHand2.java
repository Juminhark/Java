package ch04.ex03.case03;

public class MoneyOnHand2 {
	public static void main(String[] args){	
		int hand = 0;
		int price = 30000;
		int tmp = 0;
		while(hand<price){
			tmp = ((int)(Math.random()*10)+1)*1000;
			System.out.println(tmp+"원을 꺼냈습니다.");
			hand += tmp;
		}
		System.out.println("손에"+hand+"원을 쥐었습니다.");
	}	
}
