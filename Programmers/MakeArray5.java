package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray5 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for(String string : intStrs) {
            int num = Integer.parseInt(string.substring(s, s + l));

            if(k < num) {
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        int[] arr = solution(intStrs, k, s, l);

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
