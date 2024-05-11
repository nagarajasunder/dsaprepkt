package problems.array;

import java.util.Arrays;

public class SecondSmallest {

    public static int[] getSecondOrderElements(int n, int[] a) {

        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MAX_VALUE;

        for (int e : a) {
            if (e < min) {
                sMin = min;
                min = e;
            } else if (e < sMin && e != min) {
                sMin = e;
            }

            if (e > max) {
                sMax = max;
                max = e;
            } else if (e > sMax && e != max) {
                sMax = e;
            }
        }

        return new int[]{sMax,sMin};
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,5,3,6,7};
        System.out.println(Arrays.toString(getSecondOrderElements(a.length, a)));
    }

}
