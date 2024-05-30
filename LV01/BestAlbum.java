package LV01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        solution(genres, plays);
    }

    private static void solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            if(map.containsKey(genres[i])) {
                map.put(genres[i], map.get(genres[i] + plays[i]));
            } else {
                map.put(genres[i], plays[i]);
            }
        }

        List<String> genresList = new ArrayList<>(map.keySet());
        genresList.sort((o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        List<Integer> answerList = new ArrayList<>();
        genresList.forEach(li -> {
            HashMap<Integer, Integer> playsMap = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                if (li.equals(genres[i])) {
                    playsMap.put(i, plays[i]);
                }
            }

            // 내림차순
            List<Integer> playsList = new ArrayList<>(playsMap.keySet());
            Collections.sort(playsList, (o1, o2) -> (playsMap.get(o2).compareTo(playsMap.get(o1))));

            answerList.add(playsList.get(0));
            if (playsList.size() != 1) {
                answerList.add(playsList.get(1));
            }
        });
    }
}
