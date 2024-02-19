package problems.array

import java.util.Arrays

fun merge(intervals: Array<IntArray>): Array<IntArray> {


    Arrays.sort(intervals) { a, b -> a[0] - b[0] }

    val ans = mutableListOf<IntArray>()

    for (i in intervals.indices) {

        var currentStart = intervals[i][0]
        var currentEnd = intervals[i][1]

        if (ans.isEmpty() || ans[ans.size - 1][1] < currentStart) {
            ans.add(intervals[i])
        } else {
            val previousEnd = ans[ans.size - 1][1]
            currentEnd = maxOf(currentEnd, previousEnd)
            currentStart = ans[ans.size-1][0]
            ans.removeAt(ans.size-1)
            ans.add(intArrayOf(currentStart,currentEnd))
        }

    }

    val result: Array<IntArray> = Array(ans.size) { intArrayOf(2) }

    ans.forEachIndexed { i,v ->
        result[i] = v
    }

    return result

}

fun main() {
    val input = arrayOf(intArrayOf(1,3),intArrayOf(2,6),intArrayOf(8,10),intArrayOf(15,18))
    val result = merge(input)
    result.forEach {
        println(it.contentToString())
    }
}