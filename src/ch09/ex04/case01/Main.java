package ch09.ex04.case01;

public class Main extends Thread{
	private Counter counter;
	
	public Main(Counter counter){
		this.counter = counter;
	}
	
	public void run(){
		for(int i=0;i<100;i++){
			counter.inc();
			counter.dec();
			if(i%10==0) counter.print();
			try{
				sleep((int)(Math.random()*2));
			}catch(InterruptedException e){ };
		}
	}
	
	public static void main(String[] args){
		Counter counter = new Counter();
		new Main(counter).start();
		new Main(counter).start();
		new Main(counter).start();
	}
}
//3개의 쓰레드가 counter 멤버변수 하나를 공유하고있다.
//맛이 감.


/*
Main클래스가 Thread 클래스를 상속했다. 
Thread 클래스의 run 메소드를 구현하면 위와 같이 Main.start() 실행 시 test객체의 run 메소드가 수행이 된다.
(Thread 클래스를 extends 했기때문에 start 메소드 실행 시 run 메소드가 수행되는 것이다. 
Thread 클래스는 start 실행 시 run 메소드가 수행되도록 내부적으로 코딩되어 있다.)
*/

//start 메소드 실행으로 위한 thread 랩핑으로도 가능.
