package problems.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayByK {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        reverse(arr,0,k-1);
        reverse(arr,k,arr.size()-1);
        reverse(arr,0,arr.size()-1);
        return arr;
    }

    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }

    private static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void rotateBrute(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if (k == 0) {
            return;
        }
        int[] res = new int[n];
        for (int i = 0;i<n;i++) {
            res[(i+k)%n] = nums[i];
        }

        for (int i = 0;i<n;i++) {
            nums[i] = res[i];
        }
    }

    public static void rotateOptimal(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(rotateArray(list,3));
    }

}
