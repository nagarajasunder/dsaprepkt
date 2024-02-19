package problems.array;

public class ThirdLargestInArray {

    public static void main(String[] args) {
        System.out.println(thirdLargest(new int[]{1,2,4,7,7,5},6));
    }

    static int thirdLargest(int a[], int n)
    {
        int largest = a[0];
        int sLargest = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                sLargest = largest;
                largest = a[i];
            } else if (a[i] != largest && a[i] > sLargest) {
                sLargest = a[i];
            }
        }

        int tLargest = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] < sLargest && a[i] > tLargest) {
                tLargest = a[i];
            }
        }

        return tLargest;
    }
}
