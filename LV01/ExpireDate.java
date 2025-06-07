package LV01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpireDate {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(solution(today, terms, privacies));

    }

    public static List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        String[] t = today.split("\\.");
        LocalDate date = LocalDate.of(Integer.parseInt(t[0]), Integer.parseInt(t[1]), Integer.parseInt(t[2])); // 2022-05-19

        Map<String, Integer> map = new HashMap<>();

        for(String s : terms) {
            String[] temp = s.split(" ");
            map.put(temp[0], Integer.parseInt(temp[1]));  // A -> 6, B -> 12, C -> 3
        }

        for (int i = 0; i < privacies.length; i++) {
            String s = privacies[i];
            String[] temp = s.split(" ");
            int plusMonth = map.get(temp[1]); // 6
            String[] yearMonthDate = temp[0].split("\\.");

            LocalDate priDate = LocalDate.of(
                    Integer.parseInt(yearMonthDate[0]),
                    Integer.parseInt(yearMonthDate[1]),
                    Integer.parseInt(yearMonthDate[2])
            );
            // privacies 날짜: 2021-05-02

            if (priDate.getDayOfMonth() == 1) {
                LocalDate newDate = priDate.plusMonths(plusMonth);
                newDate = newDate.withDayOfMonth(28);
                newDate = newDate.minusMonths(1);

                // 날짜 비교
                if(newDate.isBefore(date)) {
                    answer.add(i + 1);
                }
            } else {
                LocalDate newDate = priDate.plusMonths(plusMonth);
                newDate = newDate.minusDays(1);

                // 날짜 비교
                if(newDate.isBefore(date)) {
                    answer.add(i + 1);
                }
            }
        }

        return answer;
    }
}
