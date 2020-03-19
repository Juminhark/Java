package ch04.ex04.case04;

import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//찾아야 할 값
		int target = (int)(Math.random()*1000)+1;
		int guess = 0;
		int tries = 0;
		
		do{
			System.out.print("찍으세여: ");
			guess = sc.nextInt();
			tries++;
			if(guess>target)
				System.out.println("더 큰수를 입력했군요.");
			else if(guess<target)
				System.out.println("더 작은수를 입력했군요.");
		}while(guess != target);
		
		System.out.printf("%d번 만에 %d을 찾았군요.",tries,target);
		
		sc.close();
	}
}
