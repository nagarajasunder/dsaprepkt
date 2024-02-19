package problems.array;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSumOptimal(arr));
    }

    public static List<List<Integer>> threeSumOptimal(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n;i++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i+1;
            int k = n-1;

            while (j < k) {
                int sum = nums[i]+nums[j]+nums[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> triplet = List.of(nums[i],nums[j],nums[k]);
                    result.add(triplet);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k+1]) k--;
                }
            }

        }

        return result;
    }

    public static List<List<Integer>> threeSumBetter(int[] nums) {

        int n = nums.length;
        Set <Integer> hashSet = new HashSet<>();
        Set<List<Integer>> result = new HashSet<>();


        for (int i = 0; i< n; i++) {
            hashSet.clear();
            for (int j = i+1;j<n;j++) {
                int thirdElement = ((nums[i]+nums[j]) * -1);
                if (hashSet.contains(thirdElement)) {
                    Integer[] triplet = new Integer[]{nums[i],nums[j],thirdElement};
                    Arrays.sort(triplet);
                    result.add(List.of(triplet));
                }
                hashSet.add(nums[j]);
            }
        }

        return result.stream().toList();
    }

    public static List<List<Integer>> threeSumBrute(int[] nums) {

        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();


        for (int i = 0; i< n; i++) {

            for (int j = i+1;j<n;j++) {

                for (int k = j+1;k<n;k++) {

                    if (nums[i]+nums[j]+nums[k] == 0) {
                        Integer[] triplet = new Integer[]{nums[i],nums[j],nums[k]};
                        Arrays.sort(triplet);
                        result.add(List.of(triplet));
                    }
                }
            }
        }

        return result.stream().toList();
    }
}
