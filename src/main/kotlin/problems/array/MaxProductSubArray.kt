package problems.array

import kotlin.math.max

fun maxProduct(nums: IntArray): Int {

    var max:Double = nums[0].toDouble()
    var leftProduct = 1.0
    var rightProduct = 1.0

    for (i in nums.indices) {

        if (leftProduct == 0.0) {
            leftProduct = 1.0
        }
        if (rightProduct == 0.0) {
            rightProduct = 1.0
        }
        leftProduct *= nums[i]
        rightProduct *= nums[nums.size - i - 1]

        max = max(max, max(leftProduct, rightProduct))


    }


    return max.toInt()
}

fun main() {
    println(maxProduct(intArrayOf(-2)))
}
