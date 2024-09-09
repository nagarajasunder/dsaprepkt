package problems.basicmath;

public class NthRootOfM {

    public static int NthRoot(int n, int m)
    {
        int low = 1;
        int high = m;

        while (low <= high) {

            int mid = (low+high)/2;
            int root = root(mid,n);
            if(root == m) {
                return mid;
            } else if (root > m) {
                high = mid - 1;
            } else {
                low = mid+1;
            }
        }

        return -1;
    }

    public static int root(int n, int times) {
      return (int) Math.pow(n,times);
    }

    public static void main(String[] args) {
        System.out.println(NthRoot(6,4096));
    }
}
