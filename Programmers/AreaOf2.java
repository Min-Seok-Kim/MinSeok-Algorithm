package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaOf2 {
    public static int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                list.add(i);
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }

        int firstValue = list.get(0);
        int lastValue = list.get(list.size() - 1);

        list.clear();

        for(int i = firstValue; i <= lastValue; i++) {
            list.add(arr[i]);
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};

       int arr1[] =  solution(arr);

       for(int i = 0; i < arr1.length; i++) {
           System.out.println(arr1[i]);
       }
    }
}
