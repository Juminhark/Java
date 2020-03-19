package ch04.ex02.case06;

public class RandomVal {
	public static void main(String[] args){
		int a = (int)(Math.random()*10)+1; // Math.random() 은 0< ? <1 값 호출
		System.out.println(a);
	}
}
