package problems.linkedlist

fun getCycleStartPoint(head:ListNode?) : ListNode? {

    var slow = head
    var fast = head
    var slowCt = 0
    var fastCt = 0

    while(fast?.next != null) {
        slow = slow?.next
        slowCt+=1
        fast = fast.next!!.next
        fastCt+=2

        if (slow == fast) {
            println(fastCt-slowCt)
            slow = head
            while (slow != fast) {
                slow = slow?.next
                fast = fast?.next
            }
            return slow
        }
    }

    return null
}

fun main() {

    var head = ListNode(1)
    head.next = ListNode(2)
    head.next!!.next = ListNode(3)
    head.next!!.next!!.next = ListNode(4)
    head.next!!.next!!.next!!.next = head.next!!.next!!
    println(getCycleStartPoint(head)?.`val`)
}