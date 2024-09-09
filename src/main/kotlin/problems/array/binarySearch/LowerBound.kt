package problems.array.binarySearch


fun lowerBound(nums:IntArray, target: Int) : Int {

    var lowerBound = -1
    val n = nums.size
    var start = 0
    var end = n-1

    while(start <= end) {
        val mid = (start+end)/2

        if (nums[mid] >= target) {
            lowerBound = mid
            end = mid-1
        } else {
            start = mid+1
        }
    }

    return lowerBound

}


fun main() {

    println(lowerBound(intArrayOf(3,5,8,15,19),23))
}