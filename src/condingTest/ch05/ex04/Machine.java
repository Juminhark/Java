package ch05.ex04;

public class Machine {
	public Ball draw(){
		return new Ball((int)(Math.random()*45)+1);
	}
}