package ch05.ex09.case02;

public class Phone {
	private static int count = 0;
	private int seriaNo;
	
	{
		seriaNo = ++count*100;
	}
	
	public Phone(){}
	
	public Phone(int seriaNo){
		this.seriaNo = seriaNo;
	}
	
	public int getSeriaNo(){
		return seriaNo;
	}
}
