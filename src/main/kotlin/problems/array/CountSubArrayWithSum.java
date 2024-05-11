package problems.array;

import java.util.HashMap;

public class CountSubArrayWithSum {

    public static int subarraySum(int[] A, int k) {
        int ct = 0;
        int sum = 0;
        int n = A.length;
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,1);

        for (int j : A) {
            sum += j;
            int rem = sum - k;

            if (prefixSumMap.containsKey(rem)) {
                ct += prefixSumMap.get(rem);
            }
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }

        return ct;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(subarraySum(arr,3));
    }


}
