package ch06.ex01;

public class Machine {
	public Ball draw(){
		return new Ball((int)(Math.random()*45)+1);
	}
}