package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeSequence {
    public static int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        int[] arr = Arrays.copyOfRange(num_list, n, num_list.length);

        for(int i : arr) {
            list.add(i);
        }

        for(int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        int[] arr = solution(num_list, n);
        
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
