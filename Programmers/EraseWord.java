package Programmers;

import java.util.Arrays;

public class EraseWord {
    public static String solution(String my_string, int[] indices) {
        String answer = "";
//        StringBuilder sb = new StringBuilder();
//        boolean[] isDeleted = new boolean[my_string.length()];
//        for(int index : indices){
//            isDeleted[index] = true;
//        }
//        for(int i = 0 ; i < my_string.length() ; i++){
//            if(isDeleted[i]){
//                continue;
//            }
//            sb.append(my_string.charAt(i));
//        }
//        answer = sb.toString();
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }


    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] arr = {1, 16, 6, 15, 0, 10, 11, 3};

        System.out.println(solution(my_string,arr));
    }
}
