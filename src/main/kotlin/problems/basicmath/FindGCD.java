package problems.basicmath;

public class FindGCD {

    public static void main(String[] args) {
        System.out.println(gcd(24,72));
    }

    public static int gcd(int A , int B)
    {
        if (A == B) {
            return A;
        } else if (A < B) {
            return gcd(A,B-A);
        } else {
            return gcd(A-B,B);
        }
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
