package problems.array;

public class RemoveMinMaxFromArray {

    public static void main(String[] args) {
        System.out.println(minimumDeletions(new int[]{2,10,7,5,4,1,8,6}));
    }

    public static int minimumDeletions(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return 1;
        }

        int min = 0;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        //Remove both elements from the front
        int p1 = Math.max(min+1,max+1);
        //Remove both elements from the back
        int p2 = Math.max(n-min,n-max);
        //Remove one element from front and one element from back
        int p3 = Math.min((min+1) + (n-max),(max+1) + (n-min));

        System.out.println("p1 "+p1+" p2 "+p2+" p3 "+p3);

        return Math.min(p1,Math.min(p2,p3));
    }
}
