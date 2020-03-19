package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static{
		s = 1; //i=1; //compile error
		System.out.println("static{}");
	}
	
	{
		i = 1; s = 1;
		System.out.println("{}");
	}
	
	public Init(){
		i = 1; s = 1;
		System.out.println("Construtot()");
	}
	
	public Init(String s){
		System.out.println("Constructil("+s+")");
	}
}
