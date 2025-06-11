package LV01;

public class SmallString {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";

        System.out.println(solution(t, p));
    }

    public static int solution(String t, String p) {
        int answer = 0;
        long pValue = Long.parseLong(p);
        int pLength = p.length();

        for (int i = 0; i <= t.length() - pLength; i++) {
            String sub = t.substring(i, i + pLength);
            long subValue = Long.parseLong(sub);
            if (subValue <= pValue) {
                answer++;
            }
        }

        return answer;
    }
}
