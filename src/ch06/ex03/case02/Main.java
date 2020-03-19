package ch06.ex03.case02;

public class Main {
	public static void main(String[] args){
		Cat cat = new Cat("야코미",3);
		System.out.println(cat.getName() + ", "+cat.getAge());
		
		/*
		Animal class의 생성자
		 	public Animal(String name){
			this.name = name;
		가 Cat class가 상속되지 않아서 name을 갖지않는다.
		 */
	}
}
