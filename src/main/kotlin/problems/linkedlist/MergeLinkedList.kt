package problems.linkedlist

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val result = ListNode(0)
    var tempResult:ListNode = result
    var temp1 = list1
    var temp2 = list2

    while(temp1 != null && temp2!= null) {

        if(temp1.`val` <= temp2.`val`) {
            tempResult.next = ListNode(temp1.`val`)
            temp1 = temp1.next
        } else {
            tempResult.next = ListNode(temp2.`val`)
            temp2 = temp2.next
        }
        tempResult = tempResult.next!!
    }

    while(temp1 != null) {
        tempResult.next = ListNode(temp1.`val`)
        temp1 = temp1.next
        tempResult = tempResult.next!!
    }

    while(temp2 != null) {
        tempResult?.next = ListNode(temp2.`val`)
        temp2 = temp2.next
        tempResult = tempResult.next!!
    }

    return result.next
}

fun main() {
    PrintListNode(mergeTwoLists(ListToListNode(listOf(1,2,4)), ListToListNode(listOf(1,3,4))))
}