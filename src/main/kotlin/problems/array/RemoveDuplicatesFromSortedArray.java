package problems.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int uniqueIdx = 0;

        for (int i = 1; i < nums.length;i++) {
            if (nums[i] != nums[uniqueIdx]) {
                nums[uniqueIdx+1] = nums[i];
                uniqueIdx+=1;
            }
        }

        return uniqueIdx+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
//        int[] arr = new int[]{1,1,2};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

}
