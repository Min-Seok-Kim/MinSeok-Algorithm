package LV03;

public class Network {

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(solution(n, computers));
    }

    private static int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int networkCount = 0;

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                networkCount++;
                dfs(i, computers, visited);
            }
        }
        return networkCount;
    }

    private static void dfs(int node, int[][] computers, boolean[] visited) {
        visited[node] = true;
        for (int neighbor = 0; neighbor < computers.length; neighbor++) {
            if(computers[node][neighbor] == 1 && !visited[neighbor]) {
                dfs(neighbor, computers, visited);
            }
        }
    }
}
