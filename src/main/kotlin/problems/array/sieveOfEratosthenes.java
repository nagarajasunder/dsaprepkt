package problems.array;

import java.util.ArrayList;
import java.util.List;

public class sieveOfEratosthenes {

    static ArrayList<Integer> sieveOfEratosthenes(int N){

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 2;i <= N;i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }

        return result;
    }

    static boolean isPrime(int N) {
        if (N == 1) {
            return false;
        }

        for (int i = 2;i*i<=N;i++) {
            if (N%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(sieveOfEratosthenes(35));
    }
}
