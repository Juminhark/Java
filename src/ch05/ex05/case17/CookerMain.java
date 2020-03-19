package ch05.ex05.case17;

public class CookerMain {
	public static void main(String[] args){
		Cooker cooker = new Cooker();
		Noodle noodle = new Noodle();
		Cucumber cucumber = new Cucumber();
		Gochujang gochujang = new Gochujang();
		
		cooker.wash(noodle);
		cooker.wash(cucumber);
		cooker.boil(noodle);
		SpicyNoodle spicyNoodle = cooker.mix(noodle, cucumber, gochujang);
		
		//위에 4줄을 1줄로 줄이면 아래
		spicyNoodle = cooker.cook(noodle, cucumber, gochujang);
	}
}
