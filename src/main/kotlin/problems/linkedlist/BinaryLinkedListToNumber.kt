package problems.linkedlist

import kotlin.math.pow

fun getDecimalValue(head: ListNode?): Int {

    var temp = head
    val binaryStr = StringBuilder()

    while(temp != null) {
        binaryStr.append("${temp.`val`}")
        temp = temp.next
    }

    val decimal = Integer.parseInt(binaryStr.toString(),2)
    return decimal


//    var ct = 0
//    var result:Long = 0
//    val binary:String = binaryStr.toString()
//    var size = binaryStr.length-1
//
//    while (size >= 0) {
//        val last = binary[size]
//        result += (last.digitToInt() * 2.0.pow(ct.toDouble()).toInt())
//        ct++
//        size--
//    }
//
//    return result.toInt()
}

fun main() {
    val head = ListToListNode(listOf(1,0,1,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,1))
    println(getDecimalValue(head))
}