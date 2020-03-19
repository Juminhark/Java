package ch06.ex03.case04;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age){   //기본 슈퍼생성자는  자식에 생성자가 생기면 자식생성자에 자동 추가
		//super(); //compile error //Animal class에 기본생성자가 없기때문에
		super(name);
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
}
