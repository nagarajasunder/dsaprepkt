package problems.basicmath

import kotlin.math.ceil

fun smallestDivisor(nums: IntArray, threshold: Int): Int {

    var high = nums[0]

    for (i in 1..<nums.size) {
        if (nums[i] > high) {
            high = nums[i]
        }
    }

    var low = 1
    var ans = high

    while (low <= high) {
        val mid = (low + high) / 2
        val sum = calculateSum(nums, mid)
        if (sum <= threshold) {
            if (mid <= ans) {
                ans = mid
            }
            high = mid-1
        } else {
            low = mid+1
        }
    }

    return ans
}

fun calculateSum(nums: IntArray, divisor: Int): Int {
    var ans = 0

    nums.forEach { num ->
        ans += ceil((num / divisor.toDouble())).toInt()
    }

    return ans
}

fun main() {
    println(smallestDivisor(intArrayOf(44,22,33,11,1),5))
}