package ch06.ex032;

public class Strawberry extends Icecream{
	private int price;
	
	public Strawberry(String name, int price){
		super(name);
		this.price = price;
	}
	
	public String toString(){
		return String.format("%s 아이스크림 %d원",getName(), price);
	}
}
