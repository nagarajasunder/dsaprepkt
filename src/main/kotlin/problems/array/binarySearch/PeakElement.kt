package problems.array.binarySearch

fun findPeakElement(nums: IntArray): Int {

    val len = nums.size

    if (len == 1) {
        return 0
    }

    for (i in 0..<len) {

        if (i == 0 && nums[i] > nums[i + 1]) {
            return i
        } else if (i == len - 1 && nums[i] > nums[i - 1]) {
            return i
        } else if (i > 0 && nums[i] > nums[i - 1] && i < len - 1 && nums[i] > nums[i + 1]) {
            return i
        }
    }

    return -1
}

fun main() {
    println(findPeakElement(intArrayOf(1, 2, 3, 1)))
}