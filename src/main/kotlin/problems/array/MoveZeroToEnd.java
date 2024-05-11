package problems.array;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static int[] moveZeros(int n, int []a) {

        if(n == 1) {
            return a;
        }

        int i = 0;
        int j = 1;

        while(j < n) {
            if(a[i] != 0) {
                i++;
                j++;
            } else if(a[i] == 0 && a[j] != 0) {
                a[i] = a[j];
                    a[j] = 0;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,0,0,1};
        System.out.println(Arrays.toString(moveZeros(a.length, a)));
    }
}
