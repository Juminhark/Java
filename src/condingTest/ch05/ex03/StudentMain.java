/*
최한석과 한아름은 공시족입니다. 한석이는 20살이고 아름이는 30살입니다.
한석이는 이제 막 일어나서는 세수를 하고있습니다.
아름이는 공부를 열심히 하고 있습니다.
*/

package ch05.ex03;

public class StudentMain {
	public static void main(String[] args){			
		Student student1 = new Student();		
		student1.setName("최한석");		
		student1.setAge(20);		
				
		Student student2 = new Student();		
		student2.setName("한아름");		
		student2.setAge(30);		
				
		student1.wakeup();		
		student2.study();		
	}			
}
