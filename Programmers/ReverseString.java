package Programmers;

public class ReverseString {
    public static String solution(String my_string, int[][] queries) {
        String answer = "";

        StringBuilder sb = new StringBuilder(my_string);


        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            String reverse = new StringBuilder(sb.substring(start, end + 1)).reverse().toString();

            sb.replace(start, end + 1, reverse);
        }

        answer = sb.toString();

        return answer;
    }


    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};


        System.out.println(solution(my_string, queries));
    }
}
