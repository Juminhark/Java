package ch06.ex03.case01;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age){
		//this.name = name; //compile error ?name member ver은 Animal class에서 private.
		this.age = age;
	}

}
