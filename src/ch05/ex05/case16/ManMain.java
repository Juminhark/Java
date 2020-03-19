package ch05.ex05.case16;

public class ManMain {
	public static void main(String[] args){
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		//위에 4줄을 1줄로 줄이면 아래
		man.sleep(pajamas);
	}
}
