package ch05.ex03.case05;

public class Car {
	private int price;
	private String makerName;
	
	public void startUp(){} //시동걸다.
	public void brake(){}   //멈추다.
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public void setMakerName(String makerName){
		this.makerName = makerName;
	}
}
