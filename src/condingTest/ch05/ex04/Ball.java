package ch05.ex04;

public class Ball {
	private int number;
	
	public Ball(){}
	
	public Ball(int number){       //생성자
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}