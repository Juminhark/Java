package ch05.ex05.case01;

import java.util.Scanner;

public class DiceMain {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		
		char isRepeat = 0;
		do{
			System.out.println(dice.roll());
			System.out.print("주사위를 굴릴까요?(y/n);>>");
			isRepeat = sc.nextLine().charAt(0);
		}while(isRepeat=='y');
		
		System.out.println("종료합니다.");
	}
}
