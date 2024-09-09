package problems.strings



fun largestOddNumber(num: String): String {

    var right = num.length - 1
    if (num[right].digitToInt() % 2 == 1) {
        return num
    }



    while (right >= 0) {

        val digit = num[right].digitToInt()
        if (digit % 2 == 1) {
            return num.substring(0,right+1)
        }
        right--
    }

    return ""
}

fun main() {
    println(largestOddNumber("10133890"))
}