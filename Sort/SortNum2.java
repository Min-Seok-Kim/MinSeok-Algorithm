package Sort;

import LV01.Memory;

import java.util.Scanner;

public class SortNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickSort quickSort = new QuickSort();

        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }



        quickSort.Solution(arr, 0, num - 1);
        for(int i = 0; i < num; i++){
            System.out.printf("%d ", arr[i]);
        }
    }


    public static class QuickSort{
        public void Solution(int data[], int start, int end) {
            if (start >= end) {
                return;
            }

            int pivot = start;
            int i = start + 1;
            int j = end;
            int temp;

            while (i <= j) {
                while (data[i] <= data[pivot]) {
                    i++;
                }
                while (data[j] >= data[pivot] && j > start) {
                    j--;
                }
                if (i > j) {
                    temp = data[j];
                    data[j] = data[pivot];
                    data[pivot] = temp;
                } else {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            Solution(data, start, j - 1);
            Solution(data, j + 1, end);
        }
    }
}
