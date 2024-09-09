package problems.linkedlist

fun reverseList(head: ListNode?): ListNode? {

    var current = head;
    var prev:ListNode? = null
    var next:ListNode? = null

    while(current != null) {

        next = current.next
        current.next = prev
        prev = current
        current = next
    }

    return prev
}

class ReverseALinkedList  {

    private var prev:ListNode? = null
    private var next:ListNode? = null
    private var current:ListNode? = null

    fun reverseListR(head:ListNode?): ListNode? {

        if (head == null) {
            return prev
        }
        current = head
        next = current!!.next
        current!!.next = prev
        prev = current
        current = next
        return reverseListR(current)
    }
}

fun main() {
    val head = ListToListNode(listOf(1,2,3,4,5))
    val x = ReverseALinkedList()
    PrintListNode(x.reverseListR(head))
}