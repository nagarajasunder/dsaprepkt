package problems.array;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoArraysAreEqual {

    public static boolean check(long[] a, long[] b, int n)
    {
        Map<Long,Long> counter = new HashMap<>();

        for (long i : a) {
            long value = counter.getOrDefault(i,0L);
            counter.put(i,++value);
        }

        for (long i : b) {
            long value = counter.getOrDefault(i,0L);
            counter.put(i,--value);
        }

        for (Map.Entry<Long,Long> entry : counter.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(new long[]{1,2,5,4,0},new long[]{2,4,5,0,56},5));
    }

}
