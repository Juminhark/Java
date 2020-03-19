package ch06.ex01;

public class test {
	public static void main(String[] args){
		Machine machine = new Machine();
		Ball ball = null;
		
		
		ball = machine.draw();
		
		System.out.print(ball.getNumber());
	}
}
