package LV01;

import java.util.ArrayDeque;
import java.util.Arrays;

public class CardBundle {
    public static String solution(String[] cards1, String[] cards2, String[] goal){
        ArrayDeque<String> deque = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> deque1 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> deque2 = new ArrayDeque<>(Arrays.asList(goal));

        while(!deque2.isEmpty()) {
            if(!deque.isEmpty() && deque.peekFirst().equals(deque2.peekFirst())) {
                deque.pollFirst();
                deque2.pollFirst();
            } else if(!deque1.isEmpty() && deque1.peekFirst().equals(deque2.peekFirst())) {
                deque1.pollFirst();
                deque2.pollFirst();
            } else {
                break;
            }
        }
        return deque2.isEmpty() ? "Yes" : "NO";

    }


    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1, cards2, goal));
    }
}
