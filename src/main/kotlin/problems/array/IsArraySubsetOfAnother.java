package problems.array;

import java.util.HashMap;
import java.util.Map;

public class IsArraySubsetOfAnother {

    public static String isSubset( long a1[], long a2[], long n, long m) {

        if (m > n) {
            return "No";
        }

        Map<Long,Long> map = new HashMap<>();

        for (long i : a2) {
           if (map.containsKey(i)) {
               long value = map.get(i);
               map.put(i,value+1);
           } else {
               map.put(i,1L);
           }
        }

        for (long i : a1) {
            if (map.containsKey(i)) {
                long value = map.get(i);
                map.put(i,value-1);
            }
        }

        for (Map.Entry<Long,Long> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return "No";
            }
        }

        return "Yes";

    }

    public static void main(String[] args) {
        long[] a1 = new long[]{1,2,3,4,5,6,7,8};
        long[] a2 = new long[]{1,2,3,1};
        System.out.println(isSubset(a1,a2, a1.length, a2.length));
    }

}
