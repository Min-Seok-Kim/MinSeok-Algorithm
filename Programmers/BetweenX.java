package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenX {
    public static int[] solution(String myString) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        String[] temp = myString.split("x", -1);

        for (String s : temp) {
            list.add(s.length());
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        String myString = "oxooxoxxox";

        solution(myString);
    }
}
