package problems.basicmath;

/**
 * <a href="https://www.geeksforgeeks.org/problems/square-root/1">Problem</a>
 */

public class SqrtOfNumber {

    public static void main(String[] args) {
        System.out.println(floorSqrt(27));
    }

    static long floorSqrt(long x)
    {
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 1;
        long end = x/2;
        long ans = 1;

        while (start <= end) {
            long mid = (start+end)/2;
            if ((mid*mid) == x) {
                return mid;
            }
            if ((mid*mid) < x) {
                start = mid+1;
                ans = mid;
            } else {
                end-=1;
            }
        }
        return ans;
    }

}
