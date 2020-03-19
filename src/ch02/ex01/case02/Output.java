package ch02.ex01.case02;

public class Output {
	public static void main(String[] arg){
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100+1);
		System.out.println(Math.random());

		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
	
		System.out.printf("%d, %c, %d, %.1f, %s\n", 
				1,'a', 10, 10.15, "hello");
		String name = "최한석";
		int age = 22;
		System.out.printf("%s은 %d살입니다.",name, age);
		System.out.println();
		System.out.println(name+"은"+age+"살입니다.");
	}
}
