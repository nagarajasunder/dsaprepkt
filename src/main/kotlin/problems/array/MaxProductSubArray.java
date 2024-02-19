package problems.array;

public class MaxProductSubArray {

    static long maxProductOptimized(int[] arr, int n) {
        long max = Long.MIN_VALUE;
        long prefix = 1;
        long suffix = 1;

        for (int i = 0;i<n;i++) {

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix*=arr[i];
            suffix*=arr[n-i-1];

            max = Math.max(max,Math.max(prefix,suffix));

        }

        return max;
    }

    static long maxProduct(int[] arr, int n) {

        long maxProduct = Long.MIN_VALUE;

        for (int i = 0; i < n;i++) {
            long currentProduct = arr[i];
            for (int j = i+1; j < n;j++) {
                currentProduct*=Math.abs(arr[j]);
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-8, 5, 3, 1, 6};
        System.out.println(maxProductOptimized(arr,arr.length));
    }

}
