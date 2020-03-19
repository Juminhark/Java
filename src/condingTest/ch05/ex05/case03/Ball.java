package ch05.ex05.case03;

public class Ball {
	private int number;
	
	public Ball(){}
	
	public Ball(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString(){
		return String.format("%d번호의 공",getNumber());
	}
}
