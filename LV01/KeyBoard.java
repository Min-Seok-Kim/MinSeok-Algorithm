package LV01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KeyBoard {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};

        System.out.println(Arrays.toString(solution(keymap, targets)));
    }


    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();

        for (String s : keymap) {
            for (int j = 0; j < s.length(); j++) {
                char cur = s.charAt(j);

                if (map.containsKey(cur)) {
                    int idx = map.get(cur);
                    map.put(cur, Math.min(idx, j + 1));
                } else {
                    map.put(cur, j + 1);
                }
            }
        }

        for(int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            boolean isTrue = true;
            for(char c : target.toCharArray()) {
                if(map.containsKey(c)) {
                    count += map.get(c);
                } else {
                    isTrue = false;
                    break;
                }
            }

            answer[i] = !isTrue ? -1 : count;
        }

        return answer;
    }
}
