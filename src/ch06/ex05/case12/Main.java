package ch06.ex05.case12;
 //이름없는 클래스 생성
public class Main {
	public static void main(String[] args){
		BusCard card = new BusCard(){
			public void tagOn(){
				System.out.println("태그 ON");
			}
			
			public void tagOff(){
				System.out.println("태그 OFF");
			}
		};
		
		card.tagOn();
		card.tagOff();
	}
}
