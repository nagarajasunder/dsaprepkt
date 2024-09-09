package problems.strings

fun removeOuterParentheses(s: String): String {

    var stack = 0
    var stackStart = 0
    val result = StringBuilder()

    for (i in s.indices) {

        if(s[i] == '(') {
            stack++
        } else if(s[i] == ')') {
            stack--
        }

        if(stack == 0) {
            result.append(s.substring(stackStart+1,i))
            stackStart = i+1
        }
    }

    return result.toString()
}

fun main() {
    println(removeOuterParentheses("()()"))
}