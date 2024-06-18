package problems.array.slidingwindow

fun countGoodSubstrings(s: String): Int {

    var total = 0
    var left = 0
    var right = 0
    var previousChar = '0'
    var uniqueChar = 0

    while (right < s.length) {
        if (right > 0 && s[right] == previousChar) {
            while (s[left] != previousChar) {
                left++
            }
            uniqueChar = 0
        } else {
            uniqueChar++
        }
        if (uniqueChar == 3) {
            total++
        }
        previousChar = s[right]
        right++
    }

    return total
}

fun main() {
    println(countGoodSubstrings("aababcabc"))
}
