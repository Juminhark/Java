/* 로또 뽑기  0이 나오지 않게*/

package condingTest.ch07.case02;

public class Lotto2 {
	public static void main(String[] args){
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++){
			ball[i] = i+1; //1~45
		}
		for(int i=0; i<100; i++){
			int n = (int)(Math.random()*45);
			
			int temp = ball[0];
			ball[0] = ball[n];
			ball[n] = temp;
		}
			
		for(int i=0; i<6; i++){
			System.out.print(ball[i]+" ");
		}
	}	
}

