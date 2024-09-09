package problems.strings

fun isIsomorphic(s: String, t: String): Boolean {

    val indexS = Array(200) { 0 }
    val indexT = Array(200) { 0 }



    val len = s.length
    if (len != t.length) {
        return false
    }

    for (i in s.indices) {
        if (indexS[s[i].code] != indexT[t[i].code]) {
            return false
        }
        indexS[s[i].code] = i+1
        indexT[t[i].code] = i+1
    }

    return true
}

fun main() {
    println(isIsomorphic("aa", "ab"))
}