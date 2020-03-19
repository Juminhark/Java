/*
타이머를 시작하면 3분마다 시간을 기록.
 */

package clock;

import java.time.LocalTime;
import java.util.Scanner;

public class Clock {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("타이머를 시작하시겠습니까? (y/n) >>");
		String ans = sc.nextLine();
		
		String minutefirst = null;         //시작시간의 분
		String minutenow = null;           //현재시간의 분
		double first = 0;
		double now = 0;
		
		switch(ans){
		case "y":{
					StringBuffer srcf = new StringBuffer(LocalTime.now()+"");
					String nowtime = srcf.substring(0,5);
					System.out.printf("%s분에 타이머를 시작하였습니다. 3분마다 시간이 기록됩니다.",nowtime);
					System.out.println();
					minutefirst = srcf.substring(3,5);
					first = Integer.parseInt(minutefirst);
					try{ Thread.sleep(60000);}catch(Exception e){}
					do{
						StringBuffer srcn = new StringBuffer(LocalTime.now()+"");
						minutenow = srcn.substring(3,5);
						now = Integer.parseInt(minutenow);
						if((now-first)%3 ==0) {
							System.out.println(LocalTime.now());
							try{ Thread.sleep(60000);}catch(Exception e){}
						}
					}while(true);
				}
		case "n":System.out.println("타이머를 종료하였습니다");
		}		
		sc.close();
	}
}
