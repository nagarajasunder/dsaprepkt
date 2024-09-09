package problems.linkedlist

fun rotateRight(head: ListNode?, k: Int): ListNode? {

    if (head?.next == null) {
        return head
    }

    var temp = head
    var len = 0

    while(temp != null) {
        temp = temp.next
        len++
    }

    val updatedRotationCt = k%len

    var result = head

    for (i in 1..updatedRotationCt) {
        result = rotateOnce(result)
    }

    return result
}

fun rotateOnce(head:ListNode?) : ListNode? {
    var temp: ListNode? = head
    var prev:ListNode? = null
    while(temp?.next != null) {
        prev = temp
        temp = temp.next
    }

    temp?.next = head
    prev?.next = null

    return temp
}


fun rotateOptimized(head:ListNode?,k:Int) : ListNode? {
    var temp = head
    var len = 1

    while(temp?.next != null) {
        temp = temp.next
        len++
    }

    var newLastIndex = len - (k%len)
    temp?.next = head
    while (newLastIndex > 0) {
        temp = temp?.next
        newLastIndex--
    }
    val result: ListNode? = temp?.next
    temp?.next = null

    return result

}




fun main() {
    PrintListNode(rotateOptimized(ListToListNode(listOf(1,2,3,4,5)),2))
}