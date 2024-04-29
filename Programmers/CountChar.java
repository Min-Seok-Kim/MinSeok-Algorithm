package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountChar {
    public static int[] solution(String my_string) {
        int[] answer = {};

        char[] c = my_string.toCharArray();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 65; i < 91; i++) {
            map.put(i, 0);
        }

        for(int i = 97; i < 123; i++) {
            map.put(i, 0);
        }

        for (char value : c) {
            if (map.containsKey((int) value)) {
                // 해당 문자의 ASCII 값에 대한 키가 맵에 존재하면 값을 1 증가시킴
                map.put((int) value, map.get((int) value) + 1);
            }
        }

        answer = new int[map.size()];
        int index = 0;
        for (int count : map.values()) {
            answer[index++] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "Programmers";

        int[] arr =  solution(my_string);

        System.out.println(arr.length);

        for (int j : arr) {
            System.out.println(j);
        }

    }
}
