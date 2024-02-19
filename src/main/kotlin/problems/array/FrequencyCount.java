package problems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void frequencyCount(int arr[], int N, int P)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i : arr) {
            int value = map.getOrDefault(i,0);
            map.put(i,value+1);
        }

        for (int i = 1;i<=N;i++) {
            arr[i-1] = map.getOrDefault(i,0);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 2, 3, 5};
        frequencyCount(arr,arr.length,5);
        System.out.println(Arrays.toString(arr));
    }

}
