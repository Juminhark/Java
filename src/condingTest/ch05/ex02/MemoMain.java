/*		
메세지와 발신자명을메모합니다. 메모지에 적힌 문구를 읽습니다.		
--		
		
메모지에 남길 메시지를 입력하세요.		
>> 오늘 오후 5시에 전화 주세요.		
메모남기신분은 누구세요?		
>> 최한석		
오늘 오후 5시에 전화 주세요 from 최한석		
*/		

package ch05.ex02;

import java.util.Scanner;

public class MemoMain {
	public static void main(String[] args){				
		Memo memo = new Memo();			
		Scanner sc = new Scanner(System.in);			
					
		System.out.print("메모지에 남길 메시지를 입력하세요. \n>>");			
		memo.setMemo(sc.nextLine());			
					
		System.out.print("메모남기신분은 누구세요?. \n>>");			
		memo.setWho(sc.nextLine());			
					
		System.out.println(memo.getMessage());			
	}				
}
