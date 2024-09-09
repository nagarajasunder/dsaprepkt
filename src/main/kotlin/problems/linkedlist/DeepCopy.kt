package problems.linkedlist


fun copyRandomListOptimized(node:Node?): Node? {
    var temp = node

    while(temp != null) {
        val copyNode = Node(temp.`val`)
        copyNode.next = temp.next
        temp.next = copyNode
        temp = temp.next!!.next
    }

    temp = node

    while(temp != null) {
        val copyNode = temp.next
        copyNode?.random = temp.random?.next
        temp = temp.next?.next
    }


    temp = node
    val result = Node(-1)
    var tempResult:Node? = result

    while(temp != null) {
        tempResult?.next =  temp.next
        temp.next = temp.next?.next
        tempResult = tempResult?.next
        temp = temp.next
    }

    return result.next
}


fun copyRandomList(node: Node?): Node? {

    val map = hashMapOf<Node?,Node?>()

    var temp = node

    while(temp != null) {
        map[temp] = Node(temp.`val`)
        temp = temp.next
    }

    temp = node

    while(temp != null) {
        if (map.containsKey(temp)) {
            val copyNode = map[temp]
            copyNode?.random = map[temp.random]
            copyNode!!.next = map[temp.next]
        }
        temp = temp.next
    }



    return map[node]
}

fun main() {
    copyRandomListOptimized(ListToNode(listOf(1,2,3,4,5)))
}