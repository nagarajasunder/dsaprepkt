package problems.array;

import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        System.out.println(fourSumOptimal(nums,target));
    }

    public static List<List<Integer>> fourSumOptimal(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0;i < n;i++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            for (int j = i+1;j<n;j++) {

                if (j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }

                int k = j+1;
                int l = n-1;

                while (k < l) {

                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        result.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k-1]) k++;
                        while (k < l && nums[l] == nums[l+1]) l--;
                    }

                }

            }

        }

        return result;
    }

    public static List<List<Integer>> fourSumBetter(int[] nums, int target) {

        int n = nums.length;
        Set<Long> hashSet = new HashSet<>();
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n;i++) {

            for (int j = i+1; j < n;j++) {
                hashSet.clear();
                for (int k = j+1; k < n;k++) {
                    long fourthElement = (target - (nums[i]+nums[j]+nums[k]));
                    if (hashSet.contains(fourthElement)) {
                        Integer[] quadreplet = new Integer[]{nums[i],nums[j],nums[k],(int) fourthElement};
                        Arrays.sort(quadreplet);
                        result.add(List.of(quadreplet));
                    }
                    hashSet.add((long)nums[k]);
                }
            }
        }

        return result.stream().toList();
    }
}
