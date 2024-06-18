package problems

fun containsDuplicate(nums: IntArray): Boolean {
    val map = hashMapOf<Int,Int>()

    nums.forEach {num ->
        if (map.containsKey(num)) {
            return true
        } else {
            map[num] = 0
        }
    }

    return false
}