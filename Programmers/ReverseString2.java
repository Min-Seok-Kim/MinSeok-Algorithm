package Programmers;

public class ReverseString2 {
    public static String solution(String my_string, int s, int e) {
        String answer = "";



        StringBuilder sb = new StringBuilder(my_string);

        String string = new StringBuilder(sb.substring(s, e + 1)).reverse().toString();

        answer = sb.replace(s, e + 1, string).toString();



        return answer;
    }

    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;

        System.out.println(solution(my_string, s, e));

    }
}
