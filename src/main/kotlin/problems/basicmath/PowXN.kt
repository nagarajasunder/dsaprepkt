package problems.basicmath

fun myPow(x: Double, n: Int): Double {

   if (n == 0) {
       return 1.0
   }
    if (n < 0) {
        return 1/ myPow(x,-n)
    }
    return x * myPow(x,n-1)
}

fun main() {
    println(myPow(0.00001,2147483647))
}
