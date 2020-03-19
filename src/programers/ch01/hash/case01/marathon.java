package programers.ch01.hash.case01;

import java.util.*;

/** 완주하지 못한 선수
 수많은 마라톤 선수들이 마라톤에 참여하였습니다.
 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 마라톤에 참여한 선수들의 이름이 담긴 배열 participant 와
 완주한 선수들의 이름이 담긴 배열 completion 이 주어질 때,
 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

 제한사항
 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 completion 의 길이는 participant 의 길이보다 1 작습니다.
 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 참가자 중에는 동명이인이 있을 수 있습니다.
 */

public class marathon {
    static String solution(String[] participant, String[] completion){
        List<String> list = new ArrayList<>(Arrays.asList(participant));

        //완주하지 못한 인원이 있을경우
        if(participant.length > completion.length) {
            Set<String> set = new HashSet<String>(Arrays.asList(participant));

            for(int j = 0 ; j < completion.length ; j++) {
                if(set.contains(completion[j])){
                    list.remove(completion[j]);
                }
            }
            return list.get(0);
        }else {
            return "완주하지 못한 선수가 없습니다.";
        }
    }

    public static void  main(String[] args){
        String answer = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"kiki", "eden"});
        System.out.println(answer);
    }
}



