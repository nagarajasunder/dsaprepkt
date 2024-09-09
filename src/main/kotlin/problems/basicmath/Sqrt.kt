package problems.basicmath




fun mySqrt(x: Int): Int {

    if (x == 1 || x == 0) {
        return x
    }


    var low:Long = 1
    var high:Long = x.toLong()
    var ans:Long = 1

    while (low <= high) {
        val mid:Long = (low+high)/2
        if ((mid*mid) < x) {
            low = mid+1
            ans = mid
        } else if ((mid*mid) > x) {
            high = mid-1
        } else {
            return mid.toInt()
        }
    }

    return ans.toInt()
}


fun main() {
    println(mySqrt(2147483647))
}