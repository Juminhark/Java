package ch02.ex03.case02;

public class DoubleTolnt {
	public static void main(String[] args){
		double d = 1.52;
		int i = (int)d;
		System.out.println(i);
		
		double f = Math.floor(d); //1.00
		double r = Math.round(d); //2.00
		System.out.printf("%.2f, %.2f\n",f,r);
		
		int f2 = (int)f;
		int r2 = (int)r;
		System.out.printf("%d, %d",f2,r2);
	}
}
