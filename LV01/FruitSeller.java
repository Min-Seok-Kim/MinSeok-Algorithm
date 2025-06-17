package LV01;

import java.util.Arrays;

public class FruitSeller {
    public static void main(String[] args) {
        int k = 4, m = 3;
        int[] arr = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        solution(k, m, arr);
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        System.out.println(Arrays.toString(score));


        for(int i = score.length - m; 0 <= i ; i -= m){
            System.out.println(i);
            answer += score[i] * m;
        }

        System.out.println(answer);

        return answer;
    }
}
