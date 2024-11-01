package LV01;

import java.util.Stack;

public class Crane {
    private static final int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1},{4,2,4,4,2}, {3,5,1,3,1}};
    private static final int[] moves = {1,5,3,5,1,2,1,4};


    public static void main(String[] args) {


        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int len = board[0].length;
        Stack<Integer> st = new Stack<>();

        for (int mv : moves) {
            mv -= 1;
            for (int i = 0; i < len; i++) {
                if (board[i][mv] != 0) {     //인형집을 위치에 인형이 있는경우 board[mv][i]
                    if (!st.isEmpty() && st.peek() == board[i][mv]) {  //지금 뽑은 인형과 마지막 인형이 같다면
                        st.pop();
                        answer += 2;
                    } else {
                        st.push(board[i][mv]);
                    }
                    board[i][mv] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
