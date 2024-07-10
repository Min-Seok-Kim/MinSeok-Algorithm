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


        /**
         * .contains -> 단어 중복 체크
         * words[i].charAt(0) != preWord -> 반복문의 증감 수에 맞는 단어의 첫 글자와 반복문에서 저장했던 이전 단어의 마지막 글자를 비교(같지 않으면 끝말잇기 실패)
         * .add -> 조건문의 조건이 성립되지 않을 경우 usedWords에 .add 메서드를 통해 해당 반복문의 증감 수에 맞는 단어 추가
         * words[i].charAt(words[i].length() - 1); -> 마찬가지로 조건문의 조건이 성립되지 않을 경우 현재 단어의 마지막 글자 추가
         */
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
