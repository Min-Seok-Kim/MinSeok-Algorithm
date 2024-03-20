package Sort;

import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[1000];
        int num, min, index = 0, temp;

        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < num; i++){
            min = 1001;
            for(int j = i; j < num; j++){
                if(min > arr[j]){
                     min = arr[j];
                     index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int i = 0; i < num; i++){
            System.out.println(arr[i]);
        }
    }
}
