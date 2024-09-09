package problems.slidingwindow

import kotlin.math.max

fun maxScore(cardPoints: IntArray, k: Int): Int {

    var leftSum = 0
    var maxSum = 0

    for (i in 0 ..< k) {
        leftSum += cardPoints[i]
    }
    maxSum = leftSum

    var rightIndex = cardPoints.size - 1

    for (i in k - 1 downTo 0) {
        leftSum-=cardPoints[i]
        leftSum+=cardPoints[rightIndex]
        rightIndex--
        maxSum = max(maxSum,leftSum)
    }

    return maxSum
}

fun main() {
    println(maxScore(intArrayOf(2,2,2),2))
}