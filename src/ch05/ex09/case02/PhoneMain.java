package ch05.ex09.case02;

public class PhoneMain {
	public static void main(String[] args){
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone(1000);
		Phone phone4 = new Phone();
		
		System.out.printf("전화기1: %d\n",phone1.getSeriaNo());
		System.out.printf("전화기2: %d\n",phone2.getSeriaNo());
		System.out.printf("전화기3: %d\n",phone3.getSeriaNo());
		System.out.printf("전화기4: %d\n",phone4.getSeriaNo());
	}
}
