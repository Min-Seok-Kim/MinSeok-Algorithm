package Programmers;


public class MakeString {
    public static String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

        for(int i : index_list) {
            char c = my_string.charAt(i);
            answer.append(c);
        }

        return answer.toString();
    }


    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int index_list[] = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        System.out.println(MakeString.solution(my_string, index_list));
    }
}
