package ch05.ex05.case13;

public class CatMain {
	public static void main(String[] args){
		Cat mommy = new Cat();
		mommy.setName("늠름이");
		
		Cat baby = mommy.breed(); //mommy.breed();로 new cat을 리턴값으로 받는다
		                          //받은 리턴값을 cat(변수타입) baby(변수) 로 받는다.
		baby.setName("이쁜이");
		System.out.printf("mommy: %s\n baby: %s",mommy.getName(),baby.getName());
	}
}
