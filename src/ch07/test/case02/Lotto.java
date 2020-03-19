/* 로또 뽑기  독립사건(independent events) */

package condingTest.ch07.case02;

public class Lotto {
	public static void main(String[] args){
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++){
			ball[i] = i; //0~44
		}
		
		int[] choiceball = new int[6];
		
		for(int i=0; i<choiceball.length; i++){
			int n = (int)(Math.random()*45);
			choiceball[i] = ball[n];
			System.out.print(choiceball[i]+" ");
		}
	}
}
