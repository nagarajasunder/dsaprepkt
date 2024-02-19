package problems.basicmath;

public class IsPerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    static int isPerfectNumber(long N) {

        long sum = 0;

        for (int i = 1; (long) i *i <= N; i++) {
            if (N%i == 0) {
                sum+=i;
                if ( N/i != N) {
                    sum+=N/i;
                }
            }
        }

        return sum == N ? 1 : 0;

    }

}
