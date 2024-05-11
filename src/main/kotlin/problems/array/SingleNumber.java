package problems.array;

/**
 * <a href="https://leetcode.com/problems/single-number/description/">...</a>
 */

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }

        int result = nums[0];

        for (int i = 1; i < n;i++) {
            result = result ^ nums[i];
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

}
