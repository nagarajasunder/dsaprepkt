package problems.basicmath;

/**
 * <a href="https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1">Problem link</a>
 */

public class ArmstrongNumber {

    static String armstrongNumber(int n){
        int nn = n;
        int sum = 0;

        while (nn > 0) {
            int rem = nn%10;
            sum+= (int) Math.pow(rem,3);
            nn/=10;
        }
        if (sum == n) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }

}
