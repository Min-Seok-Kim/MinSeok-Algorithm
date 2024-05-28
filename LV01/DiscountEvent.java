package LV01;

import java.util.HashMap;

public class DiscountEvent {
    public static int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        int answer = 0;

        for(int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> discount10d = new HashMap<>();
            for(int j = i; j < i + 10; j++) {
                if(map.containsKey(discount[j])) {
                    discount10d.put(discount[j], discount10d.getOrDefault(discount[j], 0) + 1);
                }
            }
            if(discount10d.equals(map)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solution(want, number, discount));

    }
}
