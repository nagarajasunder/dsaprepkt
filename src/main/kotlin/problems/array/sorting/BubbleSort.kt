package problems.array.sorting


/**
* This algorithm selects the next adjacent element and compares it with the current element
* If the current element is greater than the next element, then it swaps the current element
* At each pass the largest element will be moved to the last of the array
* The inner loop run only in the unsorted part i.e (n-i-1) where n is the size of the array and i is the value of the outer loop
* */

fun bubbleSort(arr:IntArray) : IntArray {

    val n = arr.size

    for (i in 0 ..< n) {

        for (j in 0 ..< n-i-1) {
            if (arr[j] > arr[j+1]) {
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }

    return arr
}


fun main() {
    var arr = intArrayOf(64, 25, 12, 22, 11)
    arr = bubbleSort(arr)
    arr.forEach {
        print("${it}, ")
    }
}