package problems.array.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1;i++) {
            swapped = false;
            for (int  j = 0; j < n - i - 1;j++) {

                if (arr[j+1] < arr[j]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return arr;
    }

    public static void bubbleSortRecursive(int[] arr, int i) {
        if (i == 1) return;
        for (int j = 0; j < i-2;j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        bubbleSortRecursive(arr,i-1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 13, 4, 1, 3, 6, 28};
        bubbleSortRecursive(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
