package LV02;

import java.util.Arrays;
import java.util.Stack;

public class StockPrice {

    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};

        System.out.println(Arrays.toString(solution(prices)));
    }

    public static int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }
}
