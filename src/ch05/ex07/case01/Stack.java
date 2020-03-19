package ch05.ex07.case01;

public class Stack {
	public void first(){
		System.out.println("first() 시작.");
		
		try{ Thread.sleep(1000); }catch(Exception e){} //1초간 대기
		this.second();
		try{ Thread.sleep(1000); }catch(Exception e){}
		
		System.out.println("first() 종료");
	}
	
	public void second(){
		System.out.println("second() 시작.");		
		try{ Thread.sleep(1000); }catch(Exception e){} //1초간 대기
		System.out.println("second() 종료");
	}
}
