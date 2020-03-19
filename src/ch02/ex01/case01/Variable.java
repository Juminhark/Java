package ch02.ex01.case01;

public class Variable {
	public static void main(String[] arg){
		
	//primitive type(원시 형) - 8가지  *실제값이 저장된다(stack 영역)
		//정수 계열
		byte b = 0;
		int i = 0;
		short s = 0;
		long l = 0L;
		
		//논리 계열
		boolean bl = false;
				
		//문자 계열
		char c = 0;
		
		//부동소수 계열(실수)
		float f = 0.0f;
		double d = 0.0;
		
	//reference type(참조형) - 원시형 8가지를 제외한 나머지 타입  *new 라는 키워드에 의해 할당받은 메모리영역은 heap영역에 생기며 stack영역에 참조한다  *gc수집 대상.
		String str = "";
		
		// 예시
		int a;
		a = 0;
		System.out.println(a);
		
		int x, y;
		int x2=0,y2=0;
		System.out.println(x2);
		System.out.println(y2);
		
		// 최대값 최소값 알아보기
		b = 127;
		b++;
		System.out.println(b);
		
		b--;
		System.out.println(b);
		
		// 1byte = s+ 7bit = 8bit
		// s가 0이면 양수, 1이면 음수로 표현하며, 7bit는 2의 7승 즉, 128개 표현이 가능하다.
		// 0부터 시작하여 127까지 표현하고 다음 +1를 하게 되면 s가 1이되고 이때 나머지값을 bitwise한후 해당값에 +1를 하게된다
		// 따라서 -128을 표현하게 된다
		
		// 00000000  ~  01111111
		// 01111111 +1 -> 10000000
		// (-)(1111111+1) = (-)(127+1) = -128
		
	}
}
