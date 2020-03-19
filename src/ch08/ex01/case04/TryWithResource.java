// Try With Resource
// finally 을 안써도 된다.
package ch08.ex01.case04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResource {
	public static void main(String[] args){
		int[] list = {1,2,3};
		try(PrintWriter out
				= new PrintWriter(new FileWriter("c:/DEV/ch08.ex01.case04.1.txt"));
			PrintWriter out2
				= new PrintWriter(new FileWriter("c:/DEV/ch08.ex01.case04.2.txt"))){
			for(int i =0;i<list.length;i++){
				out.println("list["+i+list[i]);
				out2.println("list["+i+list[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 Exception");
		}catch(IOException e){
			System.out.println("파일 Exceprion");
		}
		System.out.println("End");
	}
}
