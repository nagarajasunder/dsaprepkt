package problems.array;

 class Pair
{
    long first, second;
    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}


public class MinMaxElementInArray {

    static Pair getMinMax(long[] a, long n)
    {
        long min;
        long max;
        if (a[0] < a[1]) {
            min = a[0];
            max = a[1];
        } else {
            min = a[1];
            max = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        return new Pair(min,max);


    }

}
