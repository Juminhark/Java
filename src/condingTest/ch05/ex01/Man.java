package ch05.ex01;

import java.time.LocalDate;

public class Man {
	private String name; //이름			
	private int age; //나이			
	private LocalDate reDate; //등록일			
				
	public String getName() {			
		return name;		
	}			
	public void setName(String name) {			
		this.name = name;		
	}			
				
	public int getAge() {			
		return age;		
	}			
	public void setAge(int age) {			
		this.age = age;		
	}			
				
	public LocalDate getReDate() {			
		return reDate;		
	}			
	public void setReDate(LocalDate reDate) {			
		this.reDate = reDate;		
	}			
}
