package problems.array;

/**
 * <a href="https://leetcode.com/problems/find-the-duplicate-number/">Problem link</a>
 */

public class FindDuplicateNumber {

    public static int findDuplicateOptimal(int[] nums) {

        for (int n : nums) {
            int idx = Math.abs(n);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }
        return -1;
    }

    public static int findDuplicateBrute(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[j];
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(findDuplicateBrute(new int[]{1,3,4,2,2}));
    }

}
