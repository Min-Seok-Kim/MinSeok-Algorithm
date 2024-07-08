package LV02;



public class Fatigability {
    private static boolean[] visited;
    private static int count = 0;


    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(solution(k, dungeons));
    }

    private static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        backtrack(0, k , dungeons);

        return count;
    }

    private static void backtrack(int depth, int fatigue, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i] || dungeons[i][0] > fatigue) continue;

            visited[i] = true;
            backtrack(depth + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        count = Math.max(count, depth);
    }
}
