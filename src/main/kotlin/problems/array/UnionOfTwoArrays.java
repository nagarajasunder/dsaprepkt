package problems.array;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {


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

    }

}
