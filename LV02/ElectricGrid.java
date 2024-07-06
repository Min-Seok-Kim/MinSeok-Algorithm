package LV02;

import java.util.ArrayList;

public class ElectricGrid {
    private static boolean[] visited;
    private static ArrayList<Integer>[] adjList;
    private static int N, answer;

    public static void main(String[] args) {
        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};

        System.out.println(solution(n, wires));
    }

    private static int solution(int n, int[][] wires) {
        N = n;
        answer = n - 1;
        adjList = new ArrayList[n + 1];

        for(int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for(int[] node: wires) {
            adjList[node[0]].add(node[1]);
            adjList[node[1]].add(node[0]);
        }

        visited = new boolean[n + 1];

        dfs(1);

        return answer;
    }

    private static int dfs(int now) {
        visited[now] = true;

        int sum = 0;

        for(int next: adjList[now]) {
            if(!visited[next]) {
                int cnt = dfs(next);
                answer = Math.min(answer, Math.abs(N - cnt * 2));

                sum += cnt;
            }
        }

        return sum + 1;
    }
}
