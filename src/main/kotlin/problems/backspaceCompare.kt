package problems

import java.lang.StringBuilder

fun backspaceCompare(s: String, t: String): Boolean {
    return processBackspace(s) == processBackspace(t)
}

fun processBackspace(s:String) : String {
    val result = StringBuilder(s)
    while (result.indexOf('#') >= 0) {
        if (result.indexOf('#') == 0) {
            result.deleteCharAt(0)
        }
        else {
            result.delete(result.indexOf('#')-1,result.indexOf('#')+1)
        }
    }
    return result.toString()
}