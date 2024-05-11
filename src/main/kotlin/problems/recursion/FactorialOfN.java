package problems.recursion;

import java.util.ArrayList;
import java.util.List;

public class FactorialOfN {

    public static List<Long> factorialNumbers(long n) {
        List<Long> result = new ArrayList<>();
        long num = 1;
        while (true) {
            long factorial = findFactorial(num);
            if (factorial <= n) {
                result.add(factorial);
                num++;
            } else {
                break;
            }
        }

        return result;
    }

    private static Long findFactorial(long n) {
        if (n == 1) {
            return 1L;
        } else {
            return n*findFactorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(2));
    }
}
