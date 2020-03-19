package ch05.ex05.case03;

public class Machine {
	public Ball draw (){
		return new Ball((int)(Math.random()*45)+1);
	}
}
