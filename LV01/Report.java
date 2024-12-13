package LV01;



import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Report {
    public static void main(String[] args) {
        Report report1 = new Report();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        System.out.println(Arrays.toString(report1.solution(id_list, report, k)));
    }

    public  int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportedUser = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();

        for(String r : report) {
            String[] s = r.split(" ");

            String userId = s[0];
            String reportedId = s[1];

            if(!reportedUser.containsKey(reportedId)) {
                reportedUser.put(reportedId, new HashSet<>());
            } 
            reportedUser.get(reportedId).add(userId);
        }

        for(Map.Entry<String, HashSet<String>> entry : reportedUser.entrySet()) {
            if (entry.getValue().size() >= k) {
                for(String uid : entry.getValue()) {
                    count.put(uid, count.getOrDefault(uid, 0) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];

        for(int i = 0; i < id_list.length; i++) {
            answer[i] = count.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
    
}
