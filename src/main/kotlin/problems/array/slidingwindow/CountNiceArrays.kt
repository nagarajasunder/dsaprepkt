package problems.array.slidingwindow

fun numberOfNiceSubarrays(nums: IntArray, k: Int): Int {

    var left = 0
    var right = 0
    var oddCt = 0
    var total = 0

    while (right < nums.size) {

        if (nums[right] % 2 != 0) {
            oddCt++
        }
        while (oddCt > k) {
            println("left ${left}")
            println("right ${right}")
            if (nums[left] % 2 != 0) {
                oddCt--
            }
            left++
        }
        if (oddCt == k) {
            println("leftt ${left} - rightt ${right}")
            total++
        }
        right++
    }

    return total
}

fun main() {
    println(numberOfNiceSubarrays(intArrayOf(2,2,2,1,2,2,1,2,2,2),2))
}