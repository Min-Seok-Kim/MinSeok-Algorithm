package Programmers;

public class FindEndString {
    public static String solution(String myString, String pat) {
        String answer = "";

        int lastIndex = myString.lastIndexOf(pat.charAt(pat.length() - 1));

        for(int i = 0; i <= lastIndex; i++) {
            answer += myString.charAt(i);
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String myString = "AbCdEFG";
        String pat = "dE";

        solution(myString, pat);
    }
}
