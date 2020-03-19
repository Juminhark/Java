package ch06.ex03.case03;

public class Cat extends Animal {
	private int age;
	
	public Cat(String name, int age){   //기본 슈퍼생성자는  자식에 생성자가 생기면 자식생성자에 자동 추가
		super();
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
}
