package LV01;

public class ExpectationMatches {
    public static int solution(int N, int A, int B) {
        int answer;

        for(answer = 0; A != B; answer++) {
            A = (A + 1) / 2;
            B = (B + 1) / 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        int N = 8;
        int A = 4;
        int B = 7;

        System.out.println(solution(N, A, B));
    }
}
