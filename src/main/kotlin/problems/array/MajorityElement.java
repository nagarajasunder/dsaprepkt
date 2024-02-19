package problems.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElementVooreVotingAlgo(int[] nums) {

        int ct = 0;
        int candidate = -1;

        for (int i: nums) {
            if (ct == 0) {
                candidate = i;
            }

            if (i == candidate) {
                ct++;
            } else {
                ct--;
            }
        }

        return candidate;

    }

    public static int majorityElement(int[] nums) {

        int n = (nums.length)/2;
        Map<Integer,Integer> freq = new HashMap<>();

        for (int i : nums) {
            if(freq.containsKey(i)) {
                int value = freq.get(i)+1;
                freq.put(i,value);
                if(value > n) {
                    return i;
                }
            } else {
                freq.put(i,1);
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        System.out.println(majorityElement(arr));
    }

}
