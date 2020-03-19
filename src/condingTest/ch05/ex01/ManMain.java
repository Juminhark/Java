/*	
이름, 나이를 입력하라. 등록일은 자동 입력된다.	
입력 받은 이름, 나이, 등록일을 모아서 1명의 정보를 생성하라.	
--	
	
이름을 입력하시오.	
>> 최한석	
나이를 입력하시오.	
>> 27	
	
입력하신 1명의 정보는 다음과 같습니다.	
이  름 : 최한석	
나  이 : 27살	
등록일 : 2018-10-24	
*/	

package ch05.ex01;

import java.time.LocalDate;
import java.util.Scanner;

public class ManMain {
	public static void main(String[] args){						
		Man man = new Man();					
		Scanner sc = new Scanner(System.in);					
							
		System.out.print("이름을 입력하세요. \n>>");					
		man.setName(sc.nextLine());					
							
		System.out.print("나이를 입력하세요. \n>>");					
		man.setAge(sc.nextInt());					
							
		man.setReDate(LocalDate.now());					
							
		System.out.printf("입력하신1명의 정보는 다음과 같습니다.\n이  름: %s\n나  이: %d\n등록일: %s\n",					
				man.getName(),man.getAge(),man.getReDate());			
	}						
}							

