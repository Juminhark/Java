package ch05.ex05.case15;

public class Bread {
	private int price;
	
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public String toString(){
		return String.format("%d짜리 빵",price);
	}
}
