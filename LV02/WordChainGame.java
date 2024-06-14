package LV02;

import java.util.Arrays;
import java.util.HashSet;

public class WordChainGame {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        System.out.println(Arrays.toString(solution(n, words)));
    }

    private static int[] solution(int n, String[] words) {
        HashSet<String> usedWords = new HashSet<>();

        char preWord = words[0].charAt(0);

        for(int i = 0; i < words.length; i++) {
            if(usedWords.contains(words[i]) || words[i].charAt(0) != preWord) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            usedWords.add((words[i]));

            preWord = words[i].charAt(words[i].length() - 1);
        }

        return new int[]{0, 0};
    }
}
