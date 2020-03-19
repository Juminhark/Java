package ch09.ex01.case01;

public class Counter {
	public static void main(String[] args){
		Thread thread1 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i<20; i++) System.out.print(i+" ");
			}
		});
		
		Thread thread2 = new Thread(new Runnable(){
			public void run(){
				for(char c = 'a';c<='z';c++) System.out.print(c+" ");
			}
		});
		
		thread1.start();
		thread2.start();
	}
}


// 프로세스의 thread는 하나의 루틴(직렬적 프로그램 처리 경로)을 가진다.
// n개의 thread를 만들어 n개의 루틴을 처리 가능. 


