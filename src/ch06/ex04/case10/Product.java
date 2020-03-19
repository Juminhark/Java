package ch06.ex04.case10;

public class Product {
	protected String name;
	
	public Product(String name){
		System.out.println("A: "+this);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}
