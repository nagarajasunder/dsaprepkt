package problems.array


fun generate(numRows: Int): List<List<Int>> {

    val result = mutableListOf(mutableListOf(1))

    var i = 1

    while(i < numRows) {
        val currentRow = mutableListOf(1)
        val previousRow = result[i-1]
        if (previousRow.size > 1) {
            var m = 0
            var n = 1
            while(n < previousRow.size) {
                currentRow.add(previousRow[m]+previousRow[n])
                m++
                n++
            }
        }
        currentRow.add(1)
        result.add(currentRow)
        i++
    }

    return result
}

fun main() {
    println(generate(6))
}