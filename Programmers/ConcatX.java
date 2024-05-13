package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConcatX {
    public static String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'x') {
                if (!sb.isEmpty()) {
                    list.add(sb.toString());
                    sb.setLength(0); // StringBuilder 초기화
                }
            } else {
                sb.append(c);
            }
        }

        if (!sb.isEmpty()) {
            list.add(sb.toString());
        }

        Collections.sort(list);

        System.out.println(Arrays.toString(list.toArray()));

        return list.toArray(new String[0]);
    }


    public static void main(String[] args) {
        String myString = "dxccxbbbxaaaa";

        solution(myString);
    }
}
