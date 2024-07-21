package LV01;

import java.util.Arrays;
import java.util.Scanner;

public class ThrowDice {
    private static int N;
    private static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        result = new int[N];

        int rollNum = 0;

        roll(rollNum);
    }

    private static void roll(int rollNum) {
        if(rollNum == N) {
            System.out.println(Arrays.toString(result));
            return;
        }

        for(int i = 1; i <= 6; i++) {
            result[rollNum] = i;
            rollNum += 1;

            roll(rollNum);

            rollNum = rollNum - 1;  //다시 n번 주사위로 복귀
            result[rollNum] = 0;
        }
    }
}
