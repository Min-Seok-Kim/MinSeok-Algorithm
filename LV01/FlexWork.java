package LV01;

import java.util.*;

public class FlexWork {
    public static void main(String[] args) {
        FlexWork flexWork = new FlexWork();
        int[] schedules = {700, 800, 1100};
        int[][] timeLogs = {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int startsDay = 5;
        flexWork.solution(schedules, timeLogs, startsDay);
    }

    private static int add10Minutes(int time) {
        int hour = time / 100;
        int min = time % 100;
        min += 10;
        if (min >= 60) {
            hour += 1;
            min -= 60;
        }
        return hour * 100 + min;
    }

    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int count = 0;
        int n = schedules.length;

        for (int i = 0; i < n; i++) {
            int allowedTime = add10Minutes(schedules[i]);
            boolean canGetPrize = true;

            for (int j = 0; j < 7; j++) {
                // 요일 계산 (1:월, ..., 7:일)
                int dayOfWeek = (startday + j - 1) % 7 + 1;

                // 주말(6:토, 7:일)은 체크 안 함
                if (dayOfWeek == 6 || dayOfWeek == 7) {
                    continue;
                }

                if (timelogs[i][j] > allowedTime) {
                    canGetPrize = false;
                    break;
                }
            }

            if (canGetPrize) {
                count++;
            }
        }

        return count;
    }

}