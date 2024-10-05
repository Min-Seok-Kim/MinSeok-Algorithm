package LV01;

import java.util.*;

public class FailRate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};

        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();

         int[] failStage = new int[N + 2];
         int[] userCnts = new int[N + 1];

         for(int i : stages) {
             failStage[i]++;
         }

         userCnts[N] = failStage[N] + failStage[N + 1];

         for(int i = N - 1; i >= 1; i--) {
             userCnts[i] = failStage[i] + userCnts[i + 1];
         }

        for (int i = 1; i < userCnts.length; i++) {
            if (failStage[i] == 0 || userCnts[i] == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double)failStage[i] / userCnts[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
