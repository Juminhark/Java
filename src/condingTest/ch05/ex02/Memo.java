package ch05.ex02;

public class Memo {
	private String memo;		
	private String who;		
			
	public void setMemo(String memo) {		
		this.memo = memo;	
	}		
	public void setWho(String who) {		
		this.who = who;	
	}		
			
	public String getMessage(){		
		return memo+" from "+who;	
	}		
}
