package problems.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSomethingUsingRecursion {

    public static List<String> printNtimes(int n){
        List<String> result = new ArrayList<>();
        return populate(result,n);
    }

    private static List<String> populate(List<String> result, int ct) {
        if(ct < 1) {
            return result;
        } else {
            result.add("Coding Ninjas");
            return populate(result,ct-1);
        }
    }

    public static int[] printNos(int x) {
        int[] result = new int[x];
        result = populateArr(result,1,x);
        return result;
    }

    private static int[] populateArr(int[] list, int n, int X) {
        if (n == X) {
            list[n-1] = n;
            return list;
        } else {
            list[n-1] = n;
            return populateArr(list,n+1,X);
        }
    }

    public static void main(String[] args) {
        System.out.println(printNtimes(4));
    }

}
