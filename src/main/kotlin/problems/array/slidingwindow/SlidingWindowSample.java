package problems.array.slidingwindow;

public class SlidingWindowSample {

    public static int slidingWindowSample(int[] arr, int k) {

        int n = arr.length;
        int windowsum = 0;
        int maxsum = 0;

        for (int i = 0;i<k;i++) {
            maxsum+=arr[i];
        }

        windowsum = maxsum;

        for (int i = k;i<n;i++) {
            windowsum = windowsum + arr[i] - arr[i-k];
            if (windowsum > maxsum) {
                maxsum = windowsum;
            }
        }

        return maxsum;
    }

}
