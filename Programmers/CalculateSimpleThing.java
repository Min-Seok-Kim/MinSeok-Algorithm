package Programmers;

public class CalculateSimpleThing {
    public static int solution(String binomial) {
        int answer = 0;

        String s = binomial.substring(0, binomial.indexOf(" "));
        String b = binomial.substring(s.length() + 1, s.length() + 2);
        String c = binomial.substring(s.length() + 3);

        Integer q = Integer.valueOf(s);
        Integer e = Integer.valueOf(c);

        answer = switch (b) {
            case "+" -> q + e;
            case "-" -> q - e;
            case "*" -> q * e;
            default -> answer;
        };

        return answer;
    }

    public static void main(String[] args) {
        String binomial = "0 - 7777";


        System.out.println(solution(binomial));
    }
}
