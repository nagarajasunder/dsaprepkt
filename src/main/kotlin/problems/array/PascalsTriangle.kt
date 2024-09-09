package problems.array

fun generate2(numRows: Int): List<List<Int>> {



    val result = mutableListOf(mutableListOf(1))

    if(numRows == 1) {
        return result
    }

    for (i in 1 ..< numRows) {

        var j = 0
        val currentList = mutableListOf(1)
        val previousRowLen = result[i-1].size

        while(j < previousRowLen) {

            if(j+1 < previousRowLen) {
                currentList.add(result[i-1][j]+result[i-1][j+1])
            }
            j++
        }

        currentList.add(1)
        result.add(currentList)
    }

    return result
}

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
    println(generate2(4))
}