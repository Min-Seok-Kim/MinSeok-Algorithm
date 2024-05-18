package Programmers;

public class ChangeString {
    public static int solution(String myString, String pat) {
        int answer = 0;

        String replacedString = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');

        if (replacedString.contains(pat)) {
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";

        System.out.println(solution(myString, pat));
    }
}
