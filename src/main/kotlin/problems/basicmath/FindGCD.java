package problems.basicmath;

public class FindGCD {

    public static void main(String[] args) {
        System.out.println(gcdR(13,1));
    }

    public static int gcd(int A , int B)
    {
        int n = Math.min(A, B);
        int gcd = 1;
        for (int i = n; i >= 1; i--) {
            if ((A % i == 0) && (B % i == 0)) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static int gcdR(int a, int b) {
        if (a == b) {
            return a;
        }
        else if (a > b) {
            return gcdR(a-b,b);
        } else {
            return gcdR(a,b-a);
        }
    }
}
