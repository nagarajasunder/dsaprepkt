package problems.array;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubarrayWithSumk {

    public static int lenOfLongSubarrOptimal (int A[], int N, int k) {

        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0;i<N;i++) {
            sum+=A[i];
            if (sum == k) {
                maxLen = Math.max((i+1),maxLen);
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                maxLen = Math.max(maxLen,i-map.get(rem));
            }
            if (!map.containsKey(sum)) {
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    public static int lenOfLongSubarrBrute(int A[], int N, int K) {

        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum+=A[j];
                if (sum == K) {
                    maxLen = Math.max(maxLen,(j-i)+1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,2,1};
        int k = 3;
        System.out.println(lenOfLongSubarrOptimal(arr, arr.length, k));
    }

}
