package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
    private static ArrayList<Integer>[] adjList;
    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int start = 1;
        int n = 5;

        System.out.println(Arrays.toString(solution(graph, start, n)));
    }

    public static int[] solution(int[][] graph, int start,int n) {
        adjList = new ArrayList[n + 1];

        for(int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for(int[] edge : graph) {
            adjList[edge[0]].add(edge[1]);
        }

        visited = new boolean[n + 1];
        answer = new ArrayList<>();
        dfs(start);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void dfs(int start) {
        visited[start] = true;
        answer.add(start);

        for(int next : adjList[start]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }

}
