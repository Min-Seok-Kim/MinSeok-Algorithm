package LV02;

import java.util.Arrays;
import java.util.Scanner;

public class NQueen {
    private static int N;
    private static boolean[] visited;
    private static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        map = new int[N][N];

        visited = new boolean[N];

        int row = 0;

        nRook(row);
    }

    private static void nRook(int row) {
        if(row == N) {
            printResult();
            return;
        }

        for(int col = 0; col < N; col++) {
            if(!visited[col]) {
                map[row][col] = 1;
                visited[col] = true;
                nRook(row + 1);
                visited[col] = false;
                map[row][col] = 0;
            }
        }
        return;
    }

    private static void printResult() {
        for(int i=0;i<N;i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        System.out.println("--------------------");
    }
}
