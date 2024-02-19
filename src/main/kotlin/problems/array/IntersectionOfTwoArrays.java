package problems.array;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static int[] intersectionOptimal(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int l1 = nums1.length;
        int l2 = nums2.length;

        int i = 0;
        int j = 0;

        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersectionOptimalLeetcode(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int prev = Integer.MIN_VALUE;

        int l1 = nums1.length;
        int l2 = nums2.length;

        int i = 0;
        int j = 0;

        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                if (prev != nums1[i]) {
                    result.add(nums1[i]);
                    i++;
                    j++;
                    prev = nums1[i];
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for (int i : nums1) {
            map.put(i,0);
        }


        for (int i : nums2) {
            int value = map.getOrDefault(i,-1);
            if (value != -1 && value != 1) {
                map.put(i,++value);
                result.add(i);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int[] n1 = new int[]{4,9,5};
        int[] n2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(intersectionOptimal(n1, n2)));
    }
}

