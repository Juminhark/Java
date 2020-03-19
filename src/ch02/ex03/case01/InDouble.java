package ch02.ex03.case01;

public class InDouble {
	public static void main(String[] args){
		int i = 1;
		double d = 0.0;
	
		d = i;//i 4바이트 d는 8바이트 i를 8바이트짜리로 바꿔줘서 d에 넣는다
		System.out.println(d);
		d = (double)i;
		System.out.println(d); //(피연산자)(연산자)(피연산자) //캐스팅 연산자가 먼저 연산
	
		//i=d; //compile error d가 더 큰것이기때문에
		i = (int)d;  //자동 형변환은 오른쪽이 더 작아야 된다.
		System.out.println(i);
		System.out.println(d);
	}
}
