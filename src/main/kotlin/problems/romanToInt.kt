package problems

/**
 * https://leetcode.com/problems/roman-to-integer/?envType=featured-list&envId=top-100-liked-questions?envType=featured-list&envId=top-100-liked-questions
 * The intuition behind this problem is
 * if the next number is greater than the current number then it represents subtraction
 * if the next number is less or equal than the current number then it represents addition
 */

fun romanToInt(s: String): Int {

    val map:HashMap<Char,Int> = HashMap()
    map['I'] = 1
    map['V'] = 5
    map['X'] = 10
    map['L'] = 50
    map['C'] = 100
    map['D'] = 500
    map['M'] = 1000

    var ans = 0

    for (i in s.indices) {
        if (i < s.length -1 && map[s[i+1]]!! > map[s[i]]!!) {
            ans-=map[s[i]]!!
        }
        else {
            ans+=map[s[i]]!!
        }
    }

    return ans
}