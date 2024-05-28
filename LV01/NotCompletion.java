package LV01;

import java.util.HashMap;

public class NotCompletion {
    public static String solution(String[] completion, String[] participant) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : completion) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        for (String s : participant) {
            if (hashMap.getOrDefault(s, 0) == 0) {
                return s;
            }
            hashMap.put(s, hashMap.get(s) - 1);
        }
        return null;
    }


    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion  = {"kiki", "leo"};
        System.out.println(solution(completion, participant));
    }
}
