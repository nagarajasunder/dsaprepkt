package problems.strings

fun rotateString(s: String, goal: String): Boolean {

    val len = s.length

    if (s.length != goal.length) {
        return false
    }

    var resultString: String

    for (i in 0..<len) {

        resultString = "${s.substring(i + 1, len)}${s.substring(0,i+1)}"

        if (resultString == goal) {
            return true
        }
    }

    return false
}

fun main() {
    println(rotateString("abcde","abced"))
}