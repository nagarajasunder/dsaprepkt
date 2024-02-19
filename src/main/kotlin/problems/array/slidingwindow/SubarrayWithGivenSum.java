package problems.array.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubarrayWithGivenSum {

    public static ArrayList<Integer> subarraySumOptimal(int[] arr, int n, int s) {

        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;
        int sum = 0;

        for (int i = 0;i<n;i++) {
            sum+=arr[i];
            while (sum > s && start < i) {
                sum-=arr[start];
                start++;
            }
            if (sum == s) {
                result.add(start+1);
                result.add(i+1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }


    public static ArrayList<Integer> subarraySumBrute(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == s) {
                    result.add(i + 1);
                    result.add(j + 1);
                    return result;
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5};
        int s = 5;
        System.out.println(subarraySumOptimal(arr, arr.length, s));
    }
}
