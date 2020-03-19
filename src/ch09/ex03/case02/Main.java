package ch09.ex03.case02;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+": start.");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
		int tries = 0;
		while(counter.isAlive()){  //.isAlive() 쓰레드가 살아있다면
			tries++;
			counter.join(1000);    //join 함께 간다.또는 죽길 기다린다.
			System.out.println(Thread.currentThread().getName()+": wait."+tries);
			
			if(tries>2){
				System.out.println(Thread.currentThread().getName()+": irritated");
				counter.interrupt();  
				//준비되어 있는 인터럽트 실행, 그 처리가 끝나면 원래의 프로그램 실행.
				counter.join();  //죽길기다린다.
			}
		}
		
		System.out.println(Thread.currentThread().getName()+": end.");
	}
}
//먼저 사용하는 사용자가 공유자원을 lock 시킨다
//줄서기

//사용자는 lock. 비사용자는 줄서기