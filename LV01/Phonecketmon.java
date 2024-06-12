package LV01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Phonecketmon {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};

        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));

        int n = nums.length;

        int k = n / 2;

        return Math.min(k, set.size());
    }
}
