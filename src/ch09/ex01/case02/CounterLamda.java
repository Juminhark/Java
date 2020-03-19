package ch09.ex01.case02;

public class CounterLamda {
	public static void main(String[] args){
		Thread thread1 = new Thread(()->{
				for(int i = 0; i<10; i++) System.out.print(i+" ");
			}
		);
	
		Thread thread2 = new Thread(()->{
				for(char c ='a';c<='z';c++) System.out.print(c+" ");
			}
		);
	
		thread1.start();
		thread2.start();
	}
}
/* 람다식 
	main class(outerclass)안에서 thread1, thread2로 활동하는 1개의 class(inner class)를 만든다 
	이때 사용된 innner class는 1회성이며 innerclass에 몸체를 구성하는 방식으로 람다식이 사용된다
	
	즉 람다식은 innerclass의 1회성 객체생성용 몸체구성 방식이다.
*/