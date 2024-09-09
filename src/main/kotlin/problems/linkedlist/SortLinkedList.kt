package problems.linkedlist

import java.util.*

fun sortList(head: ListNode?): ListNode? {

    var len = 0
    var temp = head

    while(temp != null) {
        len++
        temp = temp.next
    }

    val result = IntArray(size = len)
    var index = 0
    temp = head

    while(temp != null) {
        result[index] = temp.`val`
        index++
        temp = temp.next
    }

    Arrays.sort(result)

    val resultNode = ListNode(result[0])
    temp = resultNode

    for (i in 1..<result.size) {
        temp!!.next = ListNode(result[i])
        temp = temp.next
    }

    return resultNode
}

fun main() {
    PrintListNode(sortList(ListToListNode(listOf(4,2,1,3))))
}