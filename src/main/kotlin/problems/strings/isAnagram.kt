package problems.strings

fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) {
        return false
    }

    val freq = Array(26) { 0 }

    for (i in s.indices) {
        freq[s[i]-'a']++
        freq[t[i]-'a']--
    }

    for (i in freq) {
        if (i!=0) {
            return false
        }
    }

    return true

}

fun main() {
    println(isAnagram("rat","car"))
}