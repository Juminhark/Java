/* 
 반복문에서 break:
 30 cal이상 먹어라. 상한 음식을 먹으면 그만 먹어라.
 상한 음식이란, 칼로리값이 5의 배수인것이다.  
 */

package ch04.ex03.case03;

public class Lunch {
	public static void main(String[] args){
		int calorie = 0;
		int food = 0;
		while(calorie<30){
			food = (int)(Math.random()*10)+1;
			System.out.print(food+" cal: ");
			if(food%5==0){
				System.out.println("뱉다");
				break;
			}
			System.out.println("먹다");
			calorie += food;
		}
		System.out.println(calorie+" cal만큼 먹었습니다.");
	}
}
