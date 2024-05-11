package problems.array;

/**
 * <a href="https://leetcode.com/problems/max-consecutive-ones/">Leetcode</a>
 */

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int currentOnes = 0;
        int n = nums.length;
        int maxOnes = 0;
        int j = 0;

        while(j < n) {
            if(nums[j] == 1) {
                currentOnes++;
                j++;
            } else {
                if(currentOnes > maxOnes) {
                    maxOnes = currentOnes;
                }
                currentOnes = 0;
                j++;
            }
        }

        if(currentOnes > maxOnes) {
            maxOnes = currentOnes;
        }

        return maxOnes;


    }
}
