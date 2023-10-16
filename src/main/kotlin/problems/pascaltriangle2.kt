package problems

//https://leetcode.com/problems/pascals-triangle-ii/description/?envType=daily-question&envId=2023-10-16


fun getRow(index:Int) : List<Int> {

    var initial = listOf(1)
    if (index == 0) return initial
    for (i in 0..index) {
        val current = mutableListOf(1)
        for (j in 1..<i) {
            current.add(initial[j]+initial[j-1])
        }
        current.add(1)
        println(i)
        println(current)
        initial = current
    }
    return initial
}

fun main() {
    println(getRow(3))
}

