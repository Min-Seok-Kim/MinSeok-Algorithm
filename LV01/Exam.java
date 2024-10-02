package LV01;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam {
    public static void main(String[] args) {
        int[][] patterns = {{1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int[] answer = {1,3,2,4,2};

        System.out.println(Arrays.toString(solution(patterns, answer)));
    }

    public static int[] solution(int[][] patterns, int[] answer) {
        int[] score = new int[patterns.length];

        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < patterns.length; j++) {
                if (answer[i] == patterns[j][i % patterns[j].length]) {
                    score[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(score).max().getAsInt();

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            if(score[i] == maxScore) {
                result.add(i + 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
