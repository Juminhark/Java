package programers.ch01.hash.case01;

import java.util.*;

public class solution {
        public static String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> hm = new HashMap<>();
            for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
            // 참가자 각 player 의 존재 수 를 확인 ex) a 이름 1명   <"a", 1 >,   b 이름 2명  <"b", 2>
            // hm.getOrDefault(player, 0) : 찾는 palyer 가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다. 중복 확인.

            for (String player : completion) hm.put(player, hm.get(player) - 1);
            // 완주자 각 player 를 참가자에서 빼는 과정.

            for (String key : hm.keySet()) {
                if (hm.get(key) != 0){
                    answer = key;
                }
            }
            return answer;
    }

    public static void  main(String[] args){
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"kiki", "eden"}));
    }
}
