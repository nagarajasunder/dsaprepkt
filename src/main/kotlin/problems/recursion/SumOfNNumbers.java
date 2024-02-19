package problems.recursion;

public class SumOfNNumbers {


    public static long sumFirstN(long n) {
        long sum = 0;
        return recurrsiveSum(sum,n);
    }

    private static long recurrsiveSum(long sum, long n) {
        if (n == 0) {
            return sum;
        } else {
            sum+=n;
            return recurrsiveSum(sum,n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstN(5));
    }

}
