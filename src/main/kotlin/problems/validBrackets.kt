package problems

import java.util.*

fun isValid(s: String): Boolean {
    val stack: Stack<Char> = Stack()
    for (i in s.indices) {
        val current = s[i]
        if (current == '(' || current == '[' || current == '{') {
            stack.push(current)
        } else if (stack.isEmpty()) {
            return false
        }
        else {
            val last = stack.pop()
            if (last == '[' && current != ']') return false
            if (last == '(' && current != ')') return false
            if (last == '{' && current != '}') return false
        }
    }
    return stack.isEmpty()
}