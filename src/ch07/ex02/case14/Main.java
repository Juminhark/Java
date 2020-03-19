package ch07.ex02.case14;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		List<Dog> dog1 = new ArrayList<>();
		List<Dog> dog2 = new ArrayList<>();
		List<List<Dog>> dogList = new ArrayList<>();
		
		for(int i = 0; i<3 ; i++) dog1.add(new Dog("개"+i));
		for(int i = 0; i<3 ; i++) dog2.add(new Dog("강아지"+i));
		System.out.println(dog1);  //[개0, 개1, 개2]
		System.out.println(dog2);  //[강아지0, 강아지1, 강아지2]
		
		dogList.add(dog1);
		dogList.add(dog2);
		System.out.println(dogList);  //[[개0, 개1, 개2], [강아지0, 강아지1, 강아지2]]
		
		for(List<Dog> dogs:dogList)
			for(Dog dog:dogs) dog.eat();
	}
}
