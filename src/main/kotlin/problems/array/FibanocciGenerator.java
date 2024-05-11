package problems.array;

import java.util.Arrays;

public class FibanocciGenerator {

    public static int[] generateFibonacciNumbers(int n) {

        int[] result = new int[n];
        if (n == 1) {
            result[0] = 0;
            return result;
        }
        result[0] = 0;
        result[1] = 1;
        int a = 0;
        int b = 1;

        for (int i = 2; i < n; i++) {
            int c = a+b;
            result[i] = c;
            int temp = b;
            b = c;
            a = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateFibonacciNumbers(8)));
    }

}
