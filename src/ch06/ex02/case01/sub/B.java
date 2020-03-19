package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test(){
		A test = new A();
		int x = 0;
		//x = test.a; //compile error
		//x = test.b; //compile error
		//x = test.c; //compile error
		x = test.d;
		
		//test.m1(); //compile error
		//test.m2(); //compile error
		//test.m3(); //compile error
		test.m4();
	}
}
