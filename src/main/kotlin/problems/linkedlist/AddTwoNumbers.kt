package problems.linkedlist

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

    val result = ListNode(-1)
    var resultTemp: ListNode = result

    var temp1 = l1
    var temp2 = l2

    var cf = 0

    while (temp1 != null && temp2 != null) {
        val sum = temp1.`val` + temp2.`val` + cf

        if (sum < 10) {
            resultTemp.next = ListNode(sum)
            cf = 0
        } else {
            val quo = sum % 10
            resultTemp.next = ListNode(quo)
            cf = sum / 10
        }

        resultTemp = resultTemp.next!!
        temp1 = temp1.next
        temp2 = temp2.next
    }

    while (temp1 != null) {
        val sum = temp1.`val` + cf
        if (sum < 10) {
            resultTemp.next = ListNode(sum)
            cf = 0
        } else {
            val quo = sum % 10
            resultTemp.next = ListNode(quo)
            cf = sum / 10
        }
        resultTemp = resultTemp.next!!
        temp1 = temp1.next
    }

    while (temp2 != null) {
        val sum = temp2.`val` + cf
        if (sum < 10) {
            resultTemp.next = ListNode(sum)
            cf = 0
        } else {
            val quo = sum % 10
            resultTemp.next = ListNode(quo)
            cf = sum / 10
        }
        resultTemp = resultTemp.next!!
        temp2 = temp2.next
    }

    if (cf > 0) {
        resultTemp.next = ListNode(cf)
    }

    return result.next

}

fun main() {
    PrintListNode(
        addTwoNumbers(
            ListToListNode(listOf(9,9,9,9,9,9,9)),
            ListToListNode(listOf(9,9,9,9))
        )
    )
}