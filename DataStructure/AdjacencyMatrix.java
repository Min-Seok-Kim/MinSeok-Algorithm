package DataStructure;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int[][] edges = new int[][] {
                {1, 2},
                {1, 3},
                {1, 4},
                {2, 3},
                {2, 5},
                {4, 5} // 1 -> 2 , 1 -> 3, 1 -> 4, 2 -> 3, 2 -> 5, 4 -> 5
        };

        int n = 5; // 정점의 개수

        int[][] matrix = new int[n + 1][n + 1];

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            matrix[edge[0]][edge[1]] = 1;
            matrix[edge[1]][edge[0]] = 1;
        }

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
