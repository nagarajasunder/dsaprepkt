package problems.array

import kotlin.math.max

fun maxSubArray(nums:IntArray) : Int {

    var startIndex = 0
    var endIndex = 0

    var maxSum = Int.MIN_VALUE
    var currentSum = 0

    for (i in nums.indices) {
        currentSum+=nums[i]

        if (currentSum < 0) {
            startIndex = i+1
            currentSum = 0
        }

        if (currentSum > maxSum) {
            endIndex = i
            maxSum = currentSum
        }
    }

    println("Max sum ${maxSum} [${startIndex},${endIndex}]")

    return maxSum

}

fun main() {
    println(maxSubArray(intArrayOf(1)))
}