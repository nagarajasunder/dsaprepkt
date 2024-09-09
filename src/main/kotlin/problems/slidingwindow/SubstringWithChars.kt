package problems.slidingwindow


fun numberOfSubstrings(s:String) : Int {

    var aCt = 0
    var bCt = 0
    var cCt = 0
    var total = 0
    var left = 0
    var right = 0

    while(right < s.length) {
        if (s[right] == 'a') {
            aCt++
        }
        if (s[right] == 'b') {
            bCt++
        }
        if (s[right] == 'c') {
            cCt++
        }

        while (aCt > 0 && bCt > 0 && cCt > 0) {
            total += s.length - right
            if (s[left] == 'a') {
                aCt--
            }
            if (s[left] == 'b') {
                bCt--
            }
            if (s[left] == 'c') {
                cCt--
            }
            left++
        }

        right++
    }


    return total
}



fun main() {
    println(numberOfSubstrings("abcabc"))
}