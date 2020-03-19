package condingTest.ch05.case04;

public class test {
	public static void main(String[] args){
		Machine machine = new Machine();
		Ball ball = null;
		
		
		ball = machine.draw();
		
		System.out.print(ball.getNumber());
	}
}
