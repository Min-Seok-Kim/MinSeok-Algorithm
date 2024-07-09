package LV02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Delivery {
    private static class Node {
        int dest, cost;

        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int K = 3;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};

        System.out.println(solution(N, road, K));
    }

    private static int solution(int n, int[][] road, int k) {

        // 그래프 초기화: 각 노드에 대한 인접 리스트 생성
        ArrayList<Node>[] node = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++) {
            node[i] = new ArrayList<>();
        }


        // 그래프 구축: 양방향이기 때문에 간선 두 번 추가.
        for(int[] edge: road) {
            node[edge[0]].add(new Node(edge[1], edge[2]));
            node[edge[1]].add(new Node(edge[0], edge[2]));
        }

        // 거리 배열 초기화: 각 노드까지의 최단 거리를 저장할 배열 초기화
        int dist[] = new int[n + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        // 우선순위 큐 설정: 비용이 가작 작은 노드를 먼저 처리하기 위 우선순위 큐 설정
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.cost, o2.cost));


        // 시작점 설정
        pq.add(new Node(1, 0));

        dist[1] = 0;

        while(!pq.isEmpty()) {
            Node now = pq.poll();

            if (dist[now.dest] < now.cost) continue;

            for (Node next : node[now.dest]) {
                if (dist[next.dest] > now.cost + next.cost) {
                    dist[next.dest] = now.cost + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }
            int answer = 0;

            for(int i = 1; i <= n; i++) {
                if(dist[i] <= k) answer++;
            }
            return answer;
        }
    }

