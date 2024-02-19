package problems.array;

import java.util.Arrays;

public class RotateArrayByOne {

    public static void rotate(int arr[], int n)
    {
        int lastElement = arr[n-1];

        for (int i = n-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }

        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5,6,7};
        rotate(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
