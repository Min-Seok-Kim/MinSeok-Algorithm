package Programmers;

public class CountStrings {
    public static int solution(String myString, String pat) {
        int answer = 0;

        for(int i = myString.length()-1; i>=0; i--){
            String subStr = myString.substring(0, i+1);
            if(subStr.endsWith(pat)){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";

        solution(myString, pat);
    }
}
