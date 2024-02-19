package problems.basicmath

import kotlin.math.pow

/**
 * <a href="https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1">Problem link</a>
 */

fun main() {
    val a = "3"
    val b = "10"
    val n = a.toDouble().pow(b.toDouble())
    println(getLastDigit(n.toInt()))
}

fun getLastDigit(n:Int) : Int {
    return n % 10
}