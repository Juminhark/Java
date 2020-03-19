/*
overriding

Singer .play() 노래부르다
Actor  .play() 연기하다

 */

package condingTest.ch06.case04;

public class Main {
	public static void main(String[] args){
		Singer singer = new Singer();
		Actor actor = new Actor();
		
		singer.play();
		actor.play();
	}
}