package ch07.ex01.case09;

public class TestMaon {
	public static void main(String[] args){
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);
		shooter.fire();  //빵야빵야
		shooter.setGun(rifle);
		shooter.fire();  //탕탕
	}
}
