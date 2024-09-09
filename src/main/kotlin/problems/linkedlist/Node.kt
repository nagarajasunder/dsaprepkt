package problems.linkedlist

class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}

fun ListToNode(list:List<Int>) : Node? {

    if(list.isEmpty()) {
        return null
    }
    val head = Node(list[0])
    var temp = head

    for (i in 1..<list.size) {
        temp.next = Node(list[i])
        temp = temp.next!!
    }

    return head
}

fun PrintNode(listNode:Node?) {

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