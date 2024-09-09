package problems.strings

fun reverseWords(s: String): String {

    val strArr = s.trim().split(" ")
    val result = StringBuilder()

    for (i in strArr.size - 1 downTo 0) {
        if (strArr[i].trim().isNotEmpty()) {
            if (i > 0) {
                result.append("${strArr[i].trim()} ")
            } else {
                result.append(strArr[i].trim())
            }
        }
    }

    return result.toString()
}

fun main() {
    println(reverseWords("the sky is blue"))
}