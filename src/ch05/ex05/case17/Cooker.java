package ch05.ex05.case17;

public class Cooker {
	public void wash(Noodle noodle){}
	public void wash(Cucumber cucumber){}
	public void boil(Noodle noodle){}
	public SpicyNoodle mix(Noodle noodle, Cucumber cucumber,Gochujang gochujang){
		return new SpicyNoodle();
	}
	
	
	
	public SpicyNoodle cook(Noodle noodle, Cucumber cucumber,Gochujang gochujang){
		this.wash(noodle);
		this.wash(cucumber);
		this.boil(noodle);
		return this.mix(noodle, cucumber, gochujang);
		
		// mix를 불러와서 새로운 비빔면을 만들고 쿡의 리턴값으로 준다
	}
}
