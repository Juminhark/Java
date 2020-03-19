/* while : 3의 배수를 찾아라. */

package ch04.ex03.case02;

public class DrawingLots {
	public static void main(String[] args){
		int random = 1;
		int cnt = 0; //뽑기 횟수
		
		while(!(random%3 == 0)){
			cnt++;
			random =(int)(Math.random()*100)+1;
		}
		System.out.printf("%d번 뽑아서, %d를 찾았습니다.",cnt,random);
	}// 3번 뽑아서, 18를 찾았습니다.
	//10번 뽑아서, 51를 찾았습니다.
}
