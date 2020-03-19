package condingTest.ch05.case02;

import java.util.Scanner;

public class MemoMain {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Memo paper = new Memo();
		
		System.out.print("남길실 내용 : ");
		paper.setMsg(sc.nextLine());
		
		System.out.print("남기신 분 : ");
		paper.setFrom(sc.nextLine());
		
		System.out.println(paper.getMessage());
	}
}
