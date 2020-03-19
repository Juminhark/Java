package condingTest.ch05.case02;

public class Memo {
	private String msg;
	private String from;
	
	public String getMessage(){
		return msg+ " from "+ from;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}
	
	public void setFrom(String from){
		this.from = from;
	}
}
