package problems.array.binarySearch

fun upperBound(nums:IntArray, target:Int) : Int {

    var upperBound = -1
    val n = nums.size
    var start = 0
    var end = n-1

    while(start <= end) {
        val mid = (start+end)/2

        if (nums[mid] > target) {
            upperBound = mid
            end = mid-1
        } else {
            start = mid+1
        }
    }


    return upperBound

}


fun main() {

    println(upperBound(intArrayOf(3,5,8,9,15,19),9))
}