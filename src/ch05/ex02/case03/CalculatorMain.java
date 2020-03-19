package ch05.ex02.case03;

public class CalculatorMain {
	public static void main(String[] args){
		Calculator clac = new Calculator();
		
		System.out.println("덧  셈: "+clac.add(1,2));
		System.out.println("뺄  셈: "+clac.minus(3,4));
		System.out.println("곱  셈: "+clac.multiply(5,6));
		System.out.println("나눗셈: "+clac.divide(7,8));
	}
}
