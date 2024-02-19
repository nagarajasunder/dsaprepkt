package problems.basicmath;

/**
 *
 * <a href="https://practice.geeksforgeeks.org/problems/count-digits5716/1">Problem link</a>
 */

public class CountDigits {

    public static void main(String[] args) {
        System.out.println(evenlyDivides(23));
    }

    static int evenlyDivides(int N) {

        int n = N;
        int count = 0;
        while (n > 0) {
            int rem = n%10;
            if (rem != 0 && N%rem == 0) {
                count++;
            }
            n/=10;
        }
        return count;
    }
}
