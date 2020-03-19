package ch05.ex01.case06;

public class PersonMain {
	public static void main(String[] args){
		Person person = new Person();
		
		person.setName("최한석");
		person.setAge(25);
		System.out.printf("이름: %s, 나이: %d\n", person.getName(7),person.getAge(7));
		//이름: 최한석, 나이;25
		System.out.printf("이름: %s, 나이: %d\n", person.getName(3),person.getAge(3));
		//이름: 비밀, 나이: 1000
		
		person.setName("한아름");
		person.setAge(33);
		System.out.printf("이름: %s, 나이: %d\n", person.getName(7),person.getAge(7));
		//이름: 무명, 나이: 0
		
		/*
		 compile error:
		 person.name = "양승일";
		 person.age = 50;
		 person.name;
		 person.age;
		 */
	}
}
