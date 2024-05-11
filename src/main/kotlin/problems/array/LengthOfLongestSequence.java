package problems.array;

import java.util.HashSet;

public class LengthOfLongestSequence {

    public static int longestConsecutive(int[] nums) {

        int longest = 0;
        int current = 0;
        int previousSmaller = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i - 1 == previousSmaller) {
                current++;
            } else if (i != previousSmaller) {
                current = 1;
            }
            previousSmaller = i;
            longest = Math.max(longest,current);
        }

        return longest;
    }

    public static int longestConsecutiveOptimal(int[] nums) {
        int current = 0;
        int longest = 0;
        int nextElement = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i : set) {
            if (set.contains(i-1)) {
                current = 1;
            } else {
                current = 1;
                nextElement = i+1;
                while (set.contains(nextElement)) {
                    current++;
                    nextElement++;
                }
            }
            longest = Math.max(current,longest);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutiveOptimal(arr));
    }

}
