package ch04.ex02.case03;

public class Break {
	public static void main(String[] args){
		int score = 5;
		char grade = 0;
		
		switch(score/10){
		case 10: case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		default: grade = 'D';
		}
		
		System.out.println(grade);
	}
}
