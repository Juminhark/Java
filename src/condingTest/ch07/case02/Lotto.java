/* 로또 뽑기  0이 나오지 않게*/

package ch07.test.case02;

public class Lotto {
	public static void main(String[] args){
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++)ball[i] = i+1; //1~45
		
		int temp = 0;
		int j = 0;
		
		for(int i=0; i<100; i++){
			j = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
			
		for(int i=0; i<6; i++){
			System.out.print(ball[i]+" ");
		}
	}	
}

