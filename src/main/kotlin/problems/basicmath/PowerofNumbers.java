package problems.basicmath;

public class PowerofNumbers {

    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(powerR(2,10));
    }

    static long power(int X,int N)
    {
        long ans = 1;
        while (N > 0) {
            if (N % 2 == 0) {
                X = X*X;
                N/=2;
            } else {
                ans = ans*X;
                N-=1;
            }
        }
        return ans;
    }

    static long powerR(int X,int N) {
        if (N == 0) {
            return 1;
        }
        else if (N == 1) {
            return X;
        }
        else if (N % 2 == 0) {
            long halfPower = powerR(X,N/2);
            return halfPower*halfPower;
        }
        else {
            return (X * powerR(X,N-1));
        }
    }
}
