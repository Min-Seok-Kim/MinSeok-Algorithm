package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SuffixArray {
    public static String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        System.out.println(answer.length);

        for(int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
            System.out.println(answer[i]);
        }


        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "banana";

        String[] result = solution(my_string);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
