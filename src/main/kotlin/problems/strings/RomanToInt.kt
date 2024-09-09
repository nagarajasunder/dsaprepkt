package problems.strings

fun romanToInt(s: String): Int {

    val romanValue = hashMapOf(
        Pair('I', 1),
        Pair('V', 5),
        Pair('X', 10),
        Pair('L', 50),
        Pair('C', 100),
        Pair('D', 500),
        Pair('M', 1000)
    )

    val len = s.length
    var sum = 0
    var i = 0

    while (i < len) {

        if ((i+1) < s.length && romanValue.getOrDefault(s[i],0) < romanValue.getOrDefault(s[i+1],0)) {
            sum+=(romanValue.getOrDefault(s[i+1],0) - romanValue.getOrDefault(s[i],0))
            i+=2
        } else {
            sum+=romanValue.getOrDefault(s[i],0)
            i++
        }
    }

    return sum
}

fun main() {
    println(romanToInt("IX"))
}