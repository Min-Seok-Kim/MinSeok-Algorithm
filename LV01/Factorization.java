package LV01;

import java.util.ArrayList;
import java.util.List;

public class Factorization {
    public static void main(String[] args) {
        int num = 24;

        System.out.println(factorization(num));
    }

    private static List<Integer> factorization(int num) {
        List<Integer> answer = new ArrayList<>();
        return factorize(num, 2, answer);
    }

    private static List<Integer> factorize(int num, int i, List<Integer> answer) {
        if (num == 1) {
            return answer;
        }

        if (num % i == 0) {
            answer.add(i);
            return factorize(num / i, i, answer);
        } else {
            return factorize(num, i + 1, answer);
        }
    }
}