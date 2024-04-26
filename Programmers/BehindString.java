package Programmers;

public class BehindString {
    public static String solution(String my_string, int n) {
        String answer = "";


        answer = my_string.substring(my_string.length() - n); // 3

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "He110W0r1d";
        int n = 5;

        System.out.println(solution(my_string, n));

    }
}
