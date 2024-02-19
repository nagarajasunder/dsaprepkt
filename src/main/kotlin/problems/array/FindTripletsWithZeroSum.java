package problems.array;

import java.util.Arrays;

public class FindTripletsWithZeroSum {

    public static boolean findTriplets(int[] arr, int n)
    {
        int ct = 0;
        Arrays.sort(arr);

        for (int i = 0;i < n;i++) {

            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }

            int j = i+1;
            int k = n-1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    ct++;
                    j++;
                    k--;
                    while (arr[j] == arr[j-1]) j++;
                    while (arr[k] == arr[k+1]) k--;
                }
            }
        }

        return false;
    }

    public static int findTripletsum(int[] arr, int n)
    {
        int     ct = 0;
        Arrays.sort(arr);

        for (int i = 0;i < n;i++) {

            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }

            int j = i+1;
            int k = n-1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    ct++;
                    j++;
                    k--;
                    while (arr[j] == arr[j-1]) j++;
                    while (arr[k] == arr[k+1]) k--;
                }
            }
        }

        return ct;
    }

}
