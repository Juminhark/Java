package ch04.ex01.case06;

public class Grade {
	public static void main(String[] args){
		int score = 82;
		String grade = "";
				
		System.out.println("score : " + score);
		if(score>=90){
			grade = "A";
			if(score>=98) grade += "+";
			else if(score<94) grade +="-";
		}else if(score>=80){
			grade = "B";
			if(score>=88) grade += "+";
			else if(score<84) grade +="-";
		}else if(score>=70){
			grade = "C";
			if(score>=78) grade += "+";
			else if(score<74) grade +="-";
		}else grade = "D";
		
		System.out.println("grade : "+grade);									
	}
}
