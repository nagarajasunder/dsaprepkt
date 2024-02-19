package problems.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while (j <  n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[i+1] = nums[j];
                i++;
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
//        int[] arr = new int[]{1,1,2};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

}
