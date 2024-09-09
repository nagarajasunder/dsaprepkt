package problems.strings

import java.lang.Math.pow

fun beautySum(s: String): Int {
    var sum = 0



    for (i in s.indices) {
        for (j in i..< s.length) {
            val substring = StringBuilder()
            for (k in i..j) {
                substring.append(s[k])
            }
            if (substring.length > 1) {
                val beauty = stringBeauty(substring.toString())
                sum+=beauty
            }
        }
    }

    return sum
}


fun stringBeauty(s: String): Int {
    val freq = Array<Int>(26) { 0 }
    var maxFreq = 0
    var minFreq = s.length
    var maxFreqChar = ' '
    var minFreqChar = ' '

    for (i in s.indices) {
        freq[s[i] - 'a']++
        if (freq[s[i] - 'a'] > maxFreq) {
            maxFreq = freq[s[i] - 'a']
            maxFreqChar = s[i]
            if (minFreqChar == maxFreqChar) {
                minFreqChar = ' '
                minFreq = s.length
            }
        }else if (freq[s[i] - 'a'] < minFreq) {
            minFreq = freq[s[i] - 'a']
            minFreqChar = s[i]
        }


    }

    val beauty = if (maxFreqChar == minFreqChar) {
        0
    } else {
        maxFreq - minFreq
    }
    println("For ${s} sum is max ${maxFreqChar} min ${minFreqChar} ${beauty}")
    return beauty
}

fun main() {
    println(beautySum("aabcb"))
}