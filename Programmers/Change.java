package Programmers;

import java.io.*;

public class Change {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] coins = {500, 100, 50, 10};

        int money = 1260;

        int count = 0;

        for(int i = 0; i < coins.length; i++) {
            count += money / coins[i];
            money %= coins[i];
        }

        System.out.println(count);
    }
}
