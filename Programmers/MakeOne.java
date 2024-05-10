package Programmers;

public class MakeOne {
    public static int solution(int[] num_list) {
        int answer = 0;

        for (int j : num_list) {
            int temp = j;
            while (1 < temp) {
                if (temp % 2 == 0) {
                    temp /= 2;
                    answer++;
                } else {
                    temp = (temp - 1) / 2;
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};

        System.out.println(solution(num_list));
    }
}
