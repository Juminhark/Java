package ch07.ex02.case18;

import java.util.ArrayList;
import java.util.List;

public class TestMian {
	public static void main(String[] args){
		Dove dove = new Dove();
		Duck duck = new Duck();
		Lion lion = new Lion();
		Leopard leopard = new Leopard();
		
		List<Mammal> pen = new ArrayList<>();
		pen.add(lion);
		pen.add(leopard);
		//pen.add(dove); //compile error
		
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
		//cage.add(lion); //compile error
		
		for(Mammal mammal:pen) mammal.walk();  //사자 걷다. 표범 걷다.
		System.out.println();
		
		for(Bird bird:cage)  bird.fly(); //비둘기 날다. 오리 날다.
	}
}
