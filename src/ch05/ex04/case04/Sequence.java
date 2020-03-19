package ch05.ex04.case04;

public class Sequence {
	private static int baseNum; //기준값
	private int currNum;        //현재값
	
	public static void setBaseNum(int myBaseNum){
		Sequence.baseNum = myBaseNum;
	}
	
	public int nextNum(){
		currNum = baseNum++;
		return currNum;
	}
}
