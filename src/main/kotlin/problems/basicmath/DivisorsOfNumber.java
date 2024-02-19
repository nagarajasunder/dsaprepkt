package problems.basicmath;

import java.util.ArrayList;
import java.util.List;

public class DivisorsOfNumber {

    public static List< Integer > printDivisors(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i*i <= n; i++) {
            if (n%i == 0) {
                result.add(i);
                result.add(n/i);
            }
        }
        //result.add(n);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(printDivisors(24));
    }

}
