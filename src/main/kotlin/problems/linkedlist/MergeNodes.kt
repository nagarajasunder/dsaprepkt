package problems.linkedlist

fun mergeNodes(head: ListNode?): ListNode? {

    var result:ListNode? = null
    var tempResult:ListNode? = null
    var temp = head
    var sum = 0

    while(temp != null) {

        if(temp.`val` == 0 && sum > 0) {

            if(result == null) {
                result = ListNode(sum)
                tempResult = result
            } else {
                tempResult!!.next = ListNode(sum)
                tempResult = tempResult!!.next
            }
            sum = 0
        } else {
            sum+= temp.`val`
        }
        temp = temp.next
    }

    return result
}

fun main() {
    PrintListNode(mergeNodes(ListToListNode(listOf(0,3,1,0,4,5,2,0))))
}