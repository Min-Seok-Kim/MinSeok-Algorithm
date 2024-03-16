package LV01;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String name[] = {"may", "kein", "kain", "radi"};
        int yearning[] = {5, 10, 1, 3};
        String photo[][] = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},{
                "kon", "kain", "may", "coni"
        }};

        int[] result = solution.solution(name, yearning, photo);

        for(int i: result){
            System.out.println(i);
        }
    }

    public static class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            Map<String, Integer> list = new HashMap<>();


            /**
             list = ["may": 5, "kein": 10, "kain" : 1, "radi" : 3];
             */
            for(int i = 0; i < name.length; i++){
                list.put(name[i], yearning[i]);
            }

            for (int i = 0; i < photo.length; i++) {
                for (String item: photo[i]) {
                    answer[i] += list.getOrDefault(item, 0); // getOrDefault(key, default 값): 키에 대한 값이 있으면 저장, 없으면 디폴트 값 저장
                }
            }


            return answer;
        }
    }
}
