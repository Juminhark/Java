package ch06.ex02.case01;

public class C extends A{
	public void test(){
		int x = 0;
		//x = a; //compile error
		x = b;
		x = c;
		x = d;
		
		//m1(); //compile error
		m2();
		m3();
		m4();
	}

}
