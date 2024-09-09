package problems.strings

fun longestCommonPrefix(strs: Array<String>): String {

    var shortestString = strs[0]

    for (i in strs) {
        if(i.length < shortestString.length) {
            shortestString = i
        }
    }

    val result = StringBuilder()

    for (i in shortestString.indices) {

        val prefix = shortestString[i]

        for(j in strs) {

            if(j[i] != prefix) {
                return result.toString()
            }
        }

        result.append(prefix)
    }

    return result.toString()
}

fun main() {
    println(longestCommonPrefix(arrayOf("dog","flow","flight")))
}