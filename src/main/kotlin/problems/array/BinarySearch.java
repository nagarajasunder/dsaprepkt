package problems.array;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] < target) {
                start = mid+1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 5, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 22, 23, 24, 26, 28, 31, 33, 34, 36, 37, 38, 39, 40, 42, 43, 44, 46, 47, 48, 49, 50, 54, 55, 59, 60, 62, 63, 64, 65, 66, 68, 69, 70, 71, 72, 73, 75, 77, 79, 80, 82, 86, 87, 88, 92, 93, 94, 96, 97, 98, 99, 100}, 100));
    }
}
