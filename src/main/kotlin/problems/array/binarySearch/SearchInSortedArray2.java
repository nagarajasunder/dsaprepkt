package problems.array.binarySearch;

public class SearchInSortedArray2 {

    public static void main(String[] args) {
        /*
        * Important example
        * [1,0,1,1,1]
        * */
        int[] arr = new int[]{1,0,1,1,1};
        System.out.println(search(arr,0));
    }

    public static boolean search(int[] nums, int target) {

        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start <= end) {

            int mid = start +(end-start)/2;



            if(nums[mid] == target) {
                return true;
            } else if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            else if(nums[start] <= nums[mid]) { // check if the left half is sorted
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

        return false;

    }
}
