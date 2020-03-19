package ch05.ex08.case05;

public class Citrus {
	private String name;
	
	public Citrus(){	//this("귤") => 다른생성자 호출
		this("귤");
	}
	
	public Citrus(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
