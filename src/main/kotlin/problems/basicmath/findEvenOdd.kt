package problems.basicmath

fun main() {
    println(findEvenOdd(3))
}

fun findEvenOdd(n:Int) : String {
    return if(n%2 == 0) "even" else "odd"
}