package problems.linkedlist

fun removeElements(head: ListNode?, `val`: Int): ListNode? {

    if(head == null) {
        return null
    }

    var temp = head

    if(temp.`val` == `val`) {

        while(temp != null && temp.`val` == `val`) {
            temp = temp.next
        }

        if(temp == null) { return null }
    }

    var prev = temp
    var curr = temp

    while(curr != null) {

        if(curr.`val` == `val`) {
            prev?.next = curr.next
            curr = prev?.next
        } else {
            prev = curr
            curr = curr.next
        }
    }


    return temp
}

fun main() {

    PrintListNode(removeElements(ListToListNode(listOf(7,7,7,1)),7))
}