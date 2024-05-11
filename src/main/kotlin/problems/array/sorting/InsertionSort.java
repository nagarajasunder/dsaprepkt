package problems.array.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] InsertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }

        return arr;

    }

    public static void InsertionSortRecursive(int[] arr,int i) {
        int n = arr.length;
        if(i >= n) return;
        int key = arr[i];
        int j = i-1;
        while (j >= 0 && key < arr[j]) {
            arr[j+1] = arr[j];
            j-=1;
        }
        arr[j+1] = key;
        InsertionSortRecursive(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12,11,13,6,5};
        InsertionSortRecursive(arr,1);
        System.out.println(Arrays.toString(arr));
    }

}
