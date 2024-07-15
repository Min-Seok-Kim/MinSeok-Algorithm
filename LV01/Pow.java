package LV01;

public class Pow {
    private static int N, M, num, s;


    public static void main(String[] args) {
        N = 2;
        M = 10;
        num = 1;


        int answer = pow();

        System.out.println(answer);

    }

    private static int pow() {
        if(M < num) {
            return s;
        }

        s *= N;

        num += 1;
        int result = pow();

        return result;
    }
}
