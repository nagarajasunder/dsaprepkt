package problems.basicmath;

public class ReverseANumber {

    public static void main(String[] args) {
        System.out.println(reverse_digit(200));
    }

    public static long reverse_digit(long n)
    {
        long reversed = 0;
        while (n > 0) {
            long rem = n%10;
            reversed = (reversed*10)+rem;
            n/=10;
        }
        return reversed;
    }
}
