package problems.array.slidingwindow

import kotlin.math.max

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

fun lengthOfLongestSubstring(s: String): Int {

    var longestSubStr = 0
    val map = hashMapOf<Char,Int>()
    var left = 0
    var right = 0

    while (right < s.length) {
        if (map.containsKey(s[right])) {
            left++
            right = left
            map.clear()
        }
        map[s[right]] = right
        right++

        if ((right-left) > longestSubStr) {
            longestSubStr = right - left
        }
    }

    return longestSubStr
}

fun lengthOfLongestSubstringOptimized(s:String):Int {

    var maxLen = 0
    val map = hashMapOf<Char,Int>()
    var left = 0
    var right = 0

    while(right < s.length) {

        if (!map.containsKey(s[right])) {
            map[s[right]] = right
            maxLen = max(maxLen,right-left+1)
        } else {
            while (map.containsKey(s[right])) {
                map.remove(s[left])
                left++
            }
            map[s[right]] = right
        }
        right++
    }

    return maxLen
}

fun main () {
    println(lengthOfLongestSubstringOptimized("abcazybb"))
}