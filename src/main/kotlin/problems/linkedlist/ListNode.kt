package problems.linkedlist

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun ListToListNode(list:List<Int>) : ListNode? {

    if(list.isEmpty()) {
        return null
    }
    val head = ListNode(list[0])
    var temp = head

    for (i in 1..<list.size) {
        temp.next = ListNode(list[i])
        temp = temp.next!!
    }

    return head
}

fun PrintListNode(listNode:ListNode?) {

    var temp = listNode
    print("[")
    while (temp != null) {
        if (temp.next != null) {
            print("${temp.`val`}, ")
        } else {
            print("${temp.`val`}")
        }
        temp = temp.next
    }
    print("]")
}

