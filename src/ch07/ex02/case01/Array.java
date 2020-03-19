package ch07.ex02.case01;

public class Array {
	public static void main(String[] args){
		int[] arr = new int[3];
		System.out.println(arr);  //[I@6d06d69c
		System.out.printf("%d  %d  %d\n",arr[0],arr[1],arr[2]); //0  0  0
		
		
		//index는 0부터 시작
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		System.out.printf("%d  %d  %d\n",arr[0],arr[1],arr[2]);  //0  1  2
		
		for(int i=0; i<arr.length; i++){
			arr[i] = i;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ "");  //012
		}
		System.out.println();
		
		for(int i:arr)System.out.print(i+"");  //for each 문법
		//i라는 방을 만들어서 arr을 넣어준다
		
		
		int[] array = {0, 1, 2};
		array = new int[]{0, 1, 2};
				
	}
}
