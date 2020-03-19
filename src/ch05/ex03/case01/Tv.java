package ch05.ex03.case01;

public class Tv {
	private String color;  //색깔
	private boolean power; //전원
	private int channel;   //전원
	//-----------------------------
	
	//public Tv(){} -> 자동 생성
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	//------------------------------서술어: 객체의 행동
	public void setColor(String color){
		this.color = color;
	}
	
	public void setPower(boolean power){
		this.power = power;
	}
	
	public void setChannel(int channel){
		this.channel = channel;
	}
	
	public int getChannel(){
		return channel;
	}
}