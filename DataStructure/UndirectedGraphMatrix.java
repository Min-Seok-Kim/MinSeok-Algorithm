package DataStructure;

public class UndirectedGraphMatrix {
    public static void main(String[] args) {
        int n = 5;
        int[][] graph = new int[n + 1][n + 1];

        putEdge(graph, 1, 2);
        putEdge(graph, 1, 3);
        putEdge(graph, 1, 4);
        putEdge(graph, 2, 3);
        putEdge(graph, 2, 5);
        putEdge(graph, 3, 4);
        putEdge(graph, 4, 5);

        print(graph);
    }
    public static void putEdge(int[][] graph, int x, int y) {
        graph[x][y] = 1;
        graph[y][x] = 1;
    }

    public static void print(int[][] graph) {
        for (int i = 1; i < graph.length; i++) {
            for (int j = 1; j < graph.length; j++)
                System.out.print(graph[i][j]+ " ");
            System.out.println();
        }
    }
}
