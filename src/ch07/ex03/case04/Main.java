package ch07.ex03.case04;

public class Main {
	public static void main(String[] args){
		Human man = ()->System.out.println("안녕");
		man.say();
	}
}
//lamda 문법 데이터는 가만히 있고 메서드가 옴겨다닌다.
