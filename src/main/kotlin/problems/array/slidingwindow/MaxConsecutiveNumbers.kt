package problems.array.slidingwindow

import kotlin.math.max

//https://leetcode.com/problems/max-consecutive-ones-iii/description/

fun longestOnes(nums: IntArray, k: Int): Int {

    var left = 0
    var right = 0
    var max = 0
    var currentFlipCt = k

    while (right < nums.size) {
        if (nums[right] == 0) {
            if (currentFlipCt > 0) {
                currentFlipCt--
                right++
            } else {
                currentFlipCt = k
                left++
                right = left
            }
        } else {
            right++
        }
        max = max(max, right - left)
    }

    return max
}

fun longestOnesOptimized(nums: IntArray, k: Int): Int {

    var left = 0
    var right = 0
    var maxLen = 0
    var currentFlip = 0

    while (right < nums.size) {

        if (nums[right] == 0) {
            currentFlip++
        }
        if (currentFlip > k) {
            if (nums[left] == 0) {
                currentFlip--
            }
            left++
        }
        if (currentFlip <= k) {
            maxLen = max(maxLen, right - left + 1)
        }
        right++
    }
    return maxLen

}

fun longestOnesOptimize2(nums: IntArray, k: Int): Int {

    var left = 0
    var right = 0
    var maxLen = 0
    var currentFlip = 0

    while (right < nums.size) {

        if (nums[right] == 0) {
            currentFlip++
        }

        while (currentFlip > k) {
            if (nums[left] == 0) {
                currentFlip--
            }
            left++
        }

        maxLen = max(maxLen, right - left + 1)
        right++
    }
    println("Completed")
    return maxLen

}

fun main() {
    println(longestOnesOptimized(intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2))
}