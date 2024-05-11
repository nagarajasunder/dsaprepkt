package problems.array;

import java.util.*;

public class UnionOfTwoArrays {

    public static List< Integer > sortedArray(int []a, int []b) {

        int i = 0;
        int j = 0;

        int l1 = a.length;
        int l2 = b.length;

        ArrayList<Integer> result = new ArrayList<>();

        while(i < l1 && j < l2) {
            if(a[i] <= b[j]) {
                if(result.isEmpty() || result.get(result.size()-1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
            } else {
               if (result.isEmpty() || result.get(result.size()-1) != b[j]) {
                   result.add(b[j]);
               }
                j++;
            }
        }

        while(i < l1) {
            if(result.isEmpty() || result.get(result.size()-1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }

        while(j < l2) {
            if (result.isEmpty() || result.get(result.size()-1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }

    public static int doUnion(int a[], int n, int b[], int m)
    {
        Set<Integer> resultSet = new HashSet<>();
        for (int i : a) {
            resultSet.add(i);
        }

        for (int i : b) {
            resultSet.add(i);
        }

        return resultSet.size();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 6};
        int[] b = new int[]{2,3,5};
        System.out.println(sortedArray(a,b));
    }

}
