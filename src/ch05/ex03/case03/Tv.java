package ch05.ex03.case03;

public class Tv {
	private String color;  //색깔
	private boolean power; //전원
	private int channel;   //채널
	
	public void power(){
		power = !power;
	}
	
	public void channeUp(){
		++channel;
	}
	
	public void channelDown(){
		--channel;
	}
	
	public int getChannel(){
		return channel;
	}
	
	public void setChannel(int channel){
		this.channel = channel;
	}
}
