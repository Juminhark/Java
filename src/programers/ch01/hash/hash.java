package programers.ch01.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


// hashMap 이란?
// HashMap 은 Map 을 구현한다. Key 와 Value 를 묶어 하나의 entry 로 저장 한다는 특징을 갖는다.
// key 값은 중복이 불가능 하고 value 는 중복이 가능. value 에 null 값도 사용 가능하다
// 멀티쓰레드에서 동시에 hashMap 을 건드려 key-value 값을 사용하면 문제가 될수 있다.
// 멀티쓰레드에서는 HashTable 을 쓴다.

public class hash {
    public static void main(String[] args){
        HashMap<String, Integer>fruitMap = new HashMap<>();
        fruitMap.put("사과",1000);
        fruitMap.put("배",2000);
        fruitMap.put("자두",3000);
        fruitMap.put("수박",4000);

        // get() -> key 에 해당하는 value 를 출력
        System.out.println(fruitMap.get("자두")); //3000

        // HashMap 에 넣은 Key 와 Value 를 Set 에 넣고 iterator 에 값으로 Set 정보를 담에 준다.
        // Integrator itr = fruitMap.entrySet().interator(); 와 같다.
        Set<Map.Entry<String, Integer>> set = fruitMap.entrySet();
        Iterator<Map.Entry<String, Integer>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)itr.next();
            System.out.println("이름 : " + e.getKey() + ", 가격 : " + e.getValue() + "원");
        }

    }
}
