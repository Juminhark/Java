package ch05.ex04.case03;

public class Ship {
	private int passengerCnt;            //배별 승선객수
	private static int totPassengerCnt; //누적 승선객수
	
	public void sail(int passengerCnt){
		this.passengerCnt = passengerCnt;
		totPassengerCnt += passengerCnt;
	}
	
	public int getTotPassengerCnt(){
		return totPassengerCnt;
	}
}
