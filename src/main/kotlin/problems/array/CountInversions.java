package problems.array;

import java.util.ArrayList;

public class CountInversions {

    static long ct = 0;

    public static void sort(long[] arr, int start, int end) {

        if (start < end) {
            int mid = (start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    public static void merge(long[] arr, long start, long mid, long end) {
        ArrayList<Long> temp = new ArrayList<>();

        long left = start;
        long right = mid+1;

        while (left <= mid && right <= end) {
            if (arr[(int) left] <= arr[(int) right]) {
                temp.add(arr[(int) left]);
                left++;
            } else {
                temp.add(arr[(int) right]);
                right++;
                ct+=(mid-left+1);
            }
        }

        while (left <= mid) {
            temp.add(arr[(int) left]);
            left++;
        }

        while (right <= end) {
            temp.add(arr[(int) right]);
            right++;
        }

        for (int i = (int) start; i <= end; i++) {
            arr[i] = temp.get((int) (i-start));
        }
    }

    public static long inversionCountOptimal(long arr[], long N)
    {
        sort(arr,0, (int) (N-1));
        return ct;
    }

    public static long inversionCountBrute(long arr[], long N)
    {
        long ct = 0;

        for (int i = 0;i<N-1;i++) {

            for (int j = i+1;j<N;j++) {

                if (arr[i] > arr[j]) {
                    ct++;
                }
            }
        }

        return ct;
    }

    public static void main(String[] args) {
        long[] arr = new long[]{
                174, 165, 142, 212, 254, 369, 48, 145, 163, 258, 38, 360, 224, 242, 30, 279, 317, 36, 191, 343, 289, 107, 41, 443, 265, 149, 447, 306, 391, 230, 371, 351, 7, 102
        };
        System.out.println(inversionCountOptimal(arr,arr.length));
    }
}
