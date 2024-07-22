package LV01;

public class MinNum {
    private static int N;
    private static int[][] map;
    private static boolean[] visited;
    private static int result;

    public static void main(String[] args) {
        N = 4;

        visited = new boolean[N];

        result = Integer.MAX_VALUE;

        map = new int[][]{{15, 12, 7, 8}, {21, 28, 15, 18}, {13, 11, 17, 10}, {24, 19, 22, 15}};

        int row = 0;
        int sum = 0;

        selectNum(row, sum);

        System.out.println(result);
    }

    private static void selectNum(int row, int sum) {
        if(row == N) {
            result = Math.min(result, sum);
            return;
        }

        for(int col = 0; col < N; col++) {
            if(!visited[col]){
                visited[col] = true;
                selectNum(row + 1, sum + map[row][col]);
                visited[col] = false;

            }
        }
        return;
    }


}
