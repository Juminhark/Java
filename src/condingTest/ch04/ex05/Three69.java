package ch04.ex05;

public class Three69 {
	public static void main(String[] args){				
		int ten = 0;			
		int one = 0;			
		int i = 0;			
					
		for(i=1;i<100;i++){			
			ten = i/10;		
			one = i%10;		
			System.out.print(" "+i);		
			if(ten!=0 && ten%3==0) System.out.print("짝"); //&& and		
			if(one!=0 && one%3==0) System.out.print("짝");		
			if(i%10==0) System.out.println();		
			}		
	}				
}
