package problems

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    for (i in 0 ..< strs[0].length) {
        val c = strs[0][i]
        for (j in 1 ..< strs.size) {
            //!(strs[j].length > i && strs[j][i] == c)
            if (i==strs[j].length || strs[j][i] != c) {
                return strs[0].substring(0,i)
            }
        }
    }

    return ""
}