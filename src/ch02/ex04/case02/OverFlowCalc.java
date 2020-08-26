package ch02.ex04.case02;

public class OverFlowCalc {
	public static void main(String[] args){
		byte b = 126;
		System.out.println(b); //126
		b++;                   //b=b+1
		System.out.println(b); //127
		b++;
		System.out.println(b); //-128
		b++;
		System.out.println(b); //-127
		
		
/* 1byte = 8bit = s+7bit
				1 = 1
			10 = 2
			11 = 3
					...
	1111111 = 127
10000000 = -128

s는 극 표시
s가 1이면  나머지0000000을 1111111로바꿔주고 
+1을 해준값에 음수부호를 붙인다

	*/
	}
}
