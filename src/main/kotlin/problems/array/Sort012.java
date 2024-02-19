package problems.array;

import java.util.Arrays;

public class Sort012 {

    static void sort012(int[] a) {

        int l = 0;
        int m = 0;
        int h = a.length-1;

        while (m <= h) {
            if (a[m] == 0) {
                int temp = a[l];
                a[l] = a[m];
                a[m] = temp;
                l++;
                m++;
            } else if (a[m] == 1) {
                m++;
            } else {
                int temp = a[m];
                a[m] = a[h];
                a[h] = temp;
                h--;
            }
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{0,2,1,2,0};
        sort012(a);
        System.out.println(Arrays.toString(a));
    }

}
