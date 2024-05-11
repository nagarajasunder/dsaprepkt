package problems.array.binarySearch;

/**
 * <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/">PROBLEM LINK</a>
 */

public class FindMinInRotatedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{11,13,15,17};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {

        int n = nums.length;
        int lowestElement = Integer.MAX_VALUE;

        int start = 0;
        int end = n-1;

        while(start <= end) {

            int mid = start + (end - start)/2;

            if(nums[mid] < lowestElement) {
                lowestElement = nums[mid];
            }

            //check if left half is sorted
            if(nums[start] <= nums[mid]) {
                if(nums[start] < lowestElement) {
                    lowestElement = nums[start];
                }
                start = mid+1;
            } else if (nums[mid] <= nums[end]) {
                end = mid-1;
            }
        }


        return lowestElement;
    }
}
