package problems.array.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {

        int len = arr.length;


        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                if(arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{1,45,4,3,5,6})));
    }
}
