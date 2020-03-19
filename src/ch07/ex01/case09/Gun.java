package ch07.ex01.case09;

public interface Gun {
	void fire();
}


//DI (Dependency Injection)      - has a 관계
//멤버변수에 값을 주는거
//생성자 객체를 만들자마자 줄때
//setter 나중에 값을줄때


//IO(Input/Output)
//입력 - 처리 - 출력

//도메인에 물리적인 표현은 지양한다
//상속받은 클래스는 Impl을 붙인다


//domain -> 
//dao 데이터 처리 담당객체 -> 
//service 업무 처리 담당객체 ->        : dao에 의존
//presentation 화면처리 담당객체          :servise에 의존
//입력(pre ->입력정보(service ->데이터 저장(dao ->저장결과도출(servise ->결과값노출(pre

//read(조회) write(추가 수정 삭제) - 데이터 처리

//dependency에 interface를 만든다

//userserviseimpl  implements userservise
//userservise userservise1 = new userserviseimpl(); userserviseimpl가 프로모션된다?

/* 저장공간에 대한 개념
 */

/*필요한 아이디어 : 많은 사이트에 많은 비밀번호 필요
->각 사이트에 저장된 비밀번호와 개인정보를 모아서 저장 ->ㅁ 지문이나 생체정보로 본인확인되면 ->각사이트별 대응
정보를 주어 로그인*/


//광야에서
//껍데기는 가라
//