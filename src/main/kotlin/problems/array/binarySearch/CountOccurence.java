package problems.array.binarySearch;

public class CountOccurence {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(arr,arr.length,2));
    }

    public static int count(int arr[], int n, int x) {
        int firstOccurence = firstOccurence(arr,n,x);
        int lastOccurence = lastOccurence(arr,n,x);
        
        return (lastOccurence-firstOccurence)+1;
    }


    private static int firstOccurence(int arr[], int n, int x) {

        int start = 0;
        int end = n - 1;
        int occurenceIdx = 0;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == x) {
                occurenceIdx = mid;
                end = mid - 1;
            } else if(arr[mid] > x) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return occurenceIdx;
    }

    private static int lastOccurence(int arr[], int n, int x) {

        int start = 0;
        int end = n - 1;
        int occurenceIdx = 0;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == x) {
                occurenceIdx = mid;
                start = mid + 1;
            } else if(arr[mid] > x) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return occurenceIdx;
    }

}
