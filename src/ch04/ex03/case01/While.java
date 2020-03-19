/* while : 몸무게가 60kg이 될 떄까지 줄넘기하라. */

package ch04.ex03.case01;

public class While {
	public static void main(String[] args){
		int weight = 88; //몸무게
		int jumpCnt = 0; //줄넘기 횟수
		while(weight>60){
			jumpCnt++;
			weight--;
		}
		System.out.printf("줄넘기 %d번으로, 몸무게 %dkg 달성."
				, jumpCnt,weight);
	}//줄넘기 28번으로, 몸무게 60kg 달성.
}
