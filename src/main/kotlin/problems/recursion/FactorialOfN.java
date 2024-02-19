package problems.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorialOfN {

    static ArrayList<Integer> factorial(int N){
        long factorial = 1;
        return convertToList(findFactorial(factorial,N));
    }


    private static long findFactorial(long factorial,int N) {
        System.out.println("Fact "+factorial+" N "+N);
        if (N == 1) {
            System.out.println("Factorial is "+factorial);
            return factorial;
        } else {
            factorial*=N;
            return findFactorial(factorial,N-1);
        }
    }

    private static ArrayList<Integer> convertToList(long factorial) {
        int len = String.valueOf(factorial).length();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[len]));
        int n = len-1;
        while (factorial > 0) {
            long rem = factorial%10L;
            arr.set(n,(int)rem);
            factorial/=10L;
            n--;
        }

        return arr;
    }


    public static void main(String[] args) {
        System.out.println(factorial(897));
    }
}
