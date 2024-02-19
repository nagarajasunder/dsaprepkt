package problems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairWithinGivenSum {

    static boolean hasArrayTwoCandidates2(int arr[], int n, int x) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;

        while (left < n && left < right) {
            int sum = arr[left] + arr[right];
            if (sum == x) {
                System.out.println("("+left+","+right+")");
                return true;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],i);
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(x-arr[i]) && map.get(x-arr[i]) != i) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        System.out.println(hasArrayTwoCandidates2(arr,arr.length,6));
    }
}
