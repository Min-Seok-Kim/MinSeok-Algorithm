package LV01;

import java.util.ArrayDeque;
import java.util.Deque;

public class FunctionDevelopment {
    public static int[] solution(int[] progress, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();

        int n = progress.length;

        int[] daysLeft = new int[n];

        for(int i = 0; i < n; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progress[i]) / speeds[i]);
        }

        int count = 0;
        int maxDay = daysLeft[0];

        for(int i = 0; i < n; i++) {
            if(daysLeft[i] <= maxDay) {
                count++;
            } else {
                deque.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }
        deque.add(count);
        return deque.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] progress = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        solution(progress, speeds);
    }
}
