package ch03.ex02.case01;

public class Sign {
	public static void main(String[] args){
		int i = -10;
		i = +i; // +1 * 10
		System.out.println(i); //-10
		i = -10;
		i = -i;  // -1 * -10
		System.out.println(i); //10
	}
}
