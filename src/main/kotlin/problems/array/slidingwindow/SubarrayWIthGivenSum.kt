package problems.array.slidingwindow

fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {

    val map = hashMapOf<Int,Int>()
    //map[0] = 1
    var prefixSum = 0
    var total = 0


    for (i in nums) {
        prefixSum += i
        val rem = prefixSum - goal
        if(map.containsKey(rem)) {
            total+=map.getOrDefault(rem,0)
        }
        map[prefixSum] = map.getOrDefault(prefixSum,0)+1
    }

    return total
}

fun main() {

    println(numSubarraysWithSum(intArrayOf(1,0,1,0,1),2))
}