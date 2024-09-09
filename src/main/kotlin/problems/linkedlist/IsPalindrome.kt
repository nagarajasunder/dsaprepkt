package problems.linkedlist

fun isPalindrome(head: ListNode?): Boolean {

    var temp = head
    var reverseList = reverseList2(temp)
    temp = head

    while(reverseList != null && temp != null) {

        if(reverseList.`val` != temp.`val`) {
            return false
        }
        reverseList = reverseList.next
        temp = temp.next
    }

    return true

}

fun reverseList2(head:ListNode?) : ListNode? {
    var prev:ListNode? = null
    var curr = head
    var next:ListNode?

    while(curr != null) {

        next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }

    return prev
}

fun main() {
    println(isPalindrome(ListToListNode(listOf(1,1,2,1))))
}