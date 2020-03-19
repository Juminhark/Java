package ch05.ex05.case03;

import java.util.Scanner;

public class MachineMain {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Machine machine = new Machine();
		char repMsg = 0;
		Ball ball = null;
		
		do{
			ball = machine.draw();
			System.out.print("공을 던지시겠습니다? (y/n) >> ");
			repMsg = sc.nextLine().charAt(0);
			
			if(repMsg == 'y'){
				System.out.printf("%s이 나왔습니다\n",ball);
			}else if(repMsg != 'y' && repMsg != 'n'){
			System.out.print("잘못된버튼입니다.");}
				
			
		}while(repMsg != 'n');
		System.out.print("종료되었습니다.");
	}
}
