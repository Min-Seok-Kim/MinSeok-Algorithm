package Programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SeparationWord {
    public static String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);

        StringBuilder sb = new StringBuilder();



        int n = st.countTokens();

        System.out.println(n);

        return my_string.trim().split("\\s+");
    }

    public static void main(String[] args) {
        String my_string = "  i  love  you";

        String[] a = solution(my_string);

        for(String i : a) {
            System.out.println(i);
        }
    }
}
