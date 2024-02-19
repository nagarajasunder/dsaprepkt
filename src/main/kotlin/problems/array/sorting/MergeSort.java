package problems.array.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{0,2,1,2,0};
        MergeSortAlgo algo = new MergeSortAlgo();
        algo.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}

class MergeSortAlgo {

    void merge(int[] arr, int s, int m, int e) {

        /*
         * 1. Size of two arrays
         * */
        int l1 = m-s+1;
        int l2 = e-m;

        /*
         *2. Split main array into 2 arrays
         */

        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];

        /*
         * 3. Copy elements into these two arrays
         */

        for (int i = 0; i< l1; i++) {
            arr1[i] = arr[s+i];
        }

        for (int i = 0; i< l2; i++) {
            arr2[i] = arr[m+1+i];
        }

        /*
         * 4. Merge these sorted arrays
         */

        int k = s;
        int i = 0,j = 0;
        while (i < l1 && j < l2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < l1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < l2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr, int s,int e) {
        if (s < e) {
            int m = s + (e - s) / 2;
            sort(arr,s,m);
            sort(arr,m+1,e);
            merge(arr,s,m,e);
        }
    }
}
