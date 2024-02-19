package problems.basicmath;

/**
 * <a href="https://www.geeksforgeeks.org/problems/palindrome0746/1">Problem</a>
 */

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(is_palindrome(451));
    }

    public static String is_palindrome(int n)
    {
        Math.sqrt(27);

        int nn = n;
        int rev = 0;
        while (nn > 0) {
            int rem = nn%10;
            rev = (rev*10)+rem;
            nn/=10;
        }
        if (rev == n) {
            return "Yes";
        }
        return "No";
    }

}
