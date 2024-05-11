package problems.array.binarySearch;

import java.util.Arrays;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{7,8,9,1,2,3,4,5,6};
        System.out.println(search(arr,8));
    }

    public static int search(int[] nums, int target) {

        int idx = -1;
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = start +(end-start)/2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[start] <= nums[mid]) { // check if the left half is sorted
                //is target is in left half
                if(target >= nums[start] && target <= nums[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if (nums[mid] <= nums[end]){ // check if right half is sorted
                if(target >= nums[mid] && target <= nums[end]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }

        return idx;

    }
}
