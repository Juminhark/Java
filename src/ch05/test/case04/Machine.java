package condingTest.ch05.case04;

public class Machine {
	public Ball draw(){
		return new Ball((int)(Math.random()*45)+1);
	}
}