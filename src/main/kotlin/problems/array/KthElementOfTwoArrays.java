package problems.array;

public class KthElementOfTwoArrays {

    public static long kthElementOptimal( int arr1[], int arr2[], int n, int m, int k) {

        int i = 0;
        int j = 0;
        int l = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                l++;
                if(l == k) {
                    return arr1[i];
                }
                i++;
            } else if (arr2[j] <= arr1[i]) {
                l++;
                if(l == k) {
                    return arr2[j];
                }
                j++;
            }
        }

        while (i < n) {
            l++;
            if(l == k) {
                return arr1[i];
            }
            i++;
        }

        while (j < m) {
            l++;
            if(l == k) {
                return arr2[j];
            }
            j++;
        }


        return -1;
    }

    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {

        int i = 0;
        int j = 0;
        int l = 0;

        int[] resultArr = new int[n+m];

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                resultArr[l] = arr1[i];
                i++;
            } else if (arr2[j] <= arr1[i]) {
                resultArr[l] = arr2[j];
                j++;
            }
            l++;
        }

        while (i < n) {
            resultArr[l] = arr1[i];
            i++;
            l++;
        }

        while (j < m) {
            resultArr[l] = arr2[j];
            j++;
            l++;
        }

        return resultArr[k-1];

    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 6, 7, 9};
        int[] arr2 = new int[]{1, 4, 8, 10};
        System.out.println(kthElementOptimal(arr1,arr2,arr1.length,arr2.length,5));
    }

}
