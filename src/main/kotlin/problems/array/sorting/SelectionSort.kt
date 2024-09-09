package problems.array.sorting

/**
 * How this algorithm works?
 * Loop through the unsorted part of the array then find the minimum element
 * once the minimum element in found then swap the element next to the sorted part of the array
 * Repeat the process until we reach the end of the array.
 *
 * Time Complexity = O(N^2)
 */

fun selectionSort(arr: IntArray): IntArray {

    val len = arr.size

    for (i in 0 ..< len-1) {

        var minIdx = i

        for (j in i+1 ..< len) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j
            }
        }

        if (minIdx == i) {
            return arr
        }

        val temp = arr[i]
        arr[i] = arr[minIdx]
        arr[minIdx] = temp
    }

    return arr
}

fun main() {
    var arr = intArrayOf(64,25,1,2,3)
    arr = selectionSort(arr)
    arr.forEach {
        print("${it}, ")
    }
}