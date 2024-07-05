package LV03;

import java.util.ArrayDeque;

public class BuildTrack {
    private static class Node {
        int x, y, direction, cost;

        public Node(int x, int y, int direction, int cost) {
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.cost = cost;
        }
    }

    private static int[][][] visited;
    private static int N;
    private static final int[] dx = {0, 0, -1 , 1};
    private static final int[] dy = {1, -1, 0, 0};

    private static boolean isValid(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }

    private static boolean isBlocked(int[][] board, int x, int y) {
        return (x == 0 && y == 0) || !isValid(x, y) || board[x][y] == 1;
    }

    private static int calculateCost(int direction, int preDirection, int cost) {
        if(preDirection == -1 || (preDirection - direction) % 2 == 0) return cost + 100;
        return cost + 600;
    }

    private static boolean isShouldUpdate(int x, int y, int direction, int newCost) {
        return visited[x][y][direction] == 0 || visited[x][y][direction] > newCost;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0},{0,0,0},{0,0,0}};

        System.out.println(solution(board));
    }

    private static int solution(int[][] board) {
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(0, 0, -1, 0));
        N = board.length;
        visited = new int[N][N][4];

        int answer = Integer.MAX_VALUE;

        // deque가 비어있지 않은 동안, 4방향으로 위치를 옮겨가며 로직 수행
        while(!deque.isEmpty()) {
            Node now = deque.poll();

            /**
             * 현재 좌표에서 4방향(상, 하, 좌, 우) 중 하나로 이동해 새로운 위치를 계산.
             * 새로운 위치를 계산.
             * 그 위치가 유효한지, 장애물이 없는지 확인.
             * 비용을 계산.
             * 목적지에 도달했는지 확인.
             * 아직 목적지가 아니라면, 이 새 위치를 deque에 추가하여 나중에 처리할 수 있게 한다.
             */
            for(int i = 0; i < 4; i++) {
                int new_x = now.x + dx[i];
                int new_y = now.y + dy[i];

                if(isBlocked(board, new_x, new_y)) continue;

                int new_cost = calculateCost(i, now.direction, now.cost);

                if(new_x == N - 1 && new_y == N - 1) {
                    answer = Math.min(answer, new_cost);
                } else if (isShouldUpdate(new_x, new_y, i, new_cost)) {
                    deque.add(new Node(new_x, new_y, i, new_cost));
                    visited[new_x][new_y][i] = new_cost;
                }
            }
        }

        return answer;
    }
}
