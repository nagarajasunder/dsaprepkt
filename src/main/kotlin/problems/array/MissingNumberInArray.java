package problems.array;

public class MissingNumberInArray {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{6,1,2,8,3,4,7,10,5},10));
    }


    static int missingNumberApproach2() {

    }

    static int missingNumber(int array[], int n) {
        int sumOfN = (n*(n+1))/2;
        int sum = 0;

        for (int i : array) {
            sum+=i;
        }

        return (sumOfN - sum);
    }
}
