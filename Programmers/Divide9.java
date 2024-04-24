package Programmers;

public class Divide9 {
    public static int solution(String number) {
        int sum = 0;

        for(int i = 0; i < number.length(); i++) {
            int n = Character.getNumericValue(number.charAt(i));

            sum += n;
        }

        return sum % 9;
    }

    public static void main(String[] args) {
        String number = "78720646226947352489";

        System.out.println(solution(number));
    }
}
