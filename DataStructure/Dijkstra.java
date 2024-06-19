package DataStructure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 한 노드에서 각 모든 노드까지 최단거리를 구하는 알고리즘
 *
 */
public class Dijkstra {
    private static class Node {
        int cost, dest;

        public Node(int dest, int cost) {
            this.cost = cost;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{0,1,9}, {0,2,3}, {1,0,5}, {2,1,1}};
        int start = 0;
        int n = 3;

        System.out.println(Arrays.toString(solution(graph, start, n)));
    }

    private static int[] solution(int[][] graph, int start, int n) {
        ArrayList<Node>[] adjList = new ArrayList[n];

        for(int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for(int[] edge : graph) {
            adjList[edge[0]].add(new Node(edge[1], edge[2]));
        }

        int[] dist = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(((o1, o2) -> Integer.compare(o1.cost, o2.cost)));
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (dist[now.dest] < now.cost) {
                continue;
            }
            for(Node next : adjList[now.dest]) {
                if(dist[next.dest] > now.cost + next.cost) {
                    dist[next.dest] = now.cost + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }

        return dist;
    }

}
