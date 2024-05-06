package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRight {
    public static String[] solution(String[] str_list) {
        String[] answer = {};

        for (int i = 0; i < str_list.length;i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] str_list = {"u", "u", "l", "r"};


        String arr[] = solution(str_list);

        for(String s : arr) {
            System.out.println(s);
        }
    }
}
