//map을 쓸때는 key value
//key는 유일
//value는 겹쳐도된다
// key 주민등록번호, e메일
//value 각 값.

package ch07.ex02.case16;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args){
		Map<Integer, User> map = new HashMap<>();
		map.put(1, new User("최한석"));
		map.put(2, new User("한아름"));
		map.put(3, new User("양승일"));
		map.put(4, new User("최한석"));
		System.out.println(map);  //{1=최한석, 2=한아름, 3=양승일, 4=최한석}
		
		User user = map.get(1);
		System.out.println(user);  //최한석
		System.out.println(map);  //{1=최한석, 2=한아름, 3=양승일, 4=최한석}
		
		map.remove(1);
		System.out.println(map);  //{2=한아름, 3=양승일, 4=최한석}
	}
}
