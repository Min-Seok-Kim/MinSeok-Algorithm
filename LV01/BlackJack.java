package LV01;

import java.io.*;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());



        int[] cards = new int[N];

        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(bf.readLine());
        }

        int sum = 0;
        int temp = 0;

        for(int i = 0; i < N-2; i++) { //숫자가 겹치면 안되기 때문에 i는 0부터 시작하고 N-2까지
            for(int j = i+1; j < N-1; j++) { // 다음 j는 i+1 부터 시작하고 N-1까지
                for(int k = j+1; k < N; k++) { //다음 k는 j+1부터 시작 N까지 반복
                    sum = cards[i] + cards[j] + cards[k]; //3수를 합쳐서
                    if(Math.abs(M - temp) >= Math.abs(M - sum)){ //3개의 합을 더하고 M에서 뺐을때의 값이 작을 수록 근사치
                        temp = sum;
                    }
                }
            }
        }
        bw.write(temp + " ");
        bw.flush();
        bw.close();
    }
}
