package problems.linkedlist

fun PrintListNode(listNode: MyHashMap.ListNode2?) {

    var temp = listNode
    print("[")
    while (temp != null) {
        if (temp.next != null) {
            print("(${temp.key},${temp.data}), ")
        } else {
            print("(${temp.key},${temp.data})")
        }
        temp = temp.next
    }
    print("]")
}

class MyHashMap() {


    class ListNode2(val key:Int, var data:Int) {
        var next:ListNode2? = null
    }

    private var head:ListNode2? = null

    fun put(key: Int, value: Int) {

        if(head == null) {
            head = ListNode2(key,value)
        } else {
            insert(key,value)
        }
    }

    fun get(key: Int): Int {
        var temp = head
        while(temp != null) {
            if(temp.key == key) {
                return temp.data
            }
            temp = temp.next
        }

        return -1
    }

    fun remove(key: Int) {
        var temp = head
        var prev:ListNode2? = null
        while(temp != null) {
            if(temp.key == key) {
                prev?.next = temp.next
                return
            }
            prev = temp
            temp = temp.next
        }
    }

    private fun insert(key:Int,value:Int) {
        var temp = head

        while(temp != null) {
            if(temp.key == key) {
                temp.data = value
                return
            }
            temp = temp.next
        }
        temp = ListNode2(key,value)
        head = temp
        //PrintListNode(head)
        //println()
    }

}

fun main() {
    val myHashMap = MyHashMap()
    myHashMap.put(1, 1) // The map is now [[1,1]]
    myHashMap.put(2, 2) // The map is now [[1,1], [2,2]]
    println(myHashMap.get(1)) // return 1, The map is now [[1,1], [2,2]]
    println(myHashMap.get(3)) // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
    myHashMap.put(2, 1) // The map is now [[1,1], [2,1]] (i.e., update the existing value)
    println(myHashMap.get(2)) // return 1, The map is now [[1,1], [2,1]]
    myHashMap.remove(2) // remove the mapping for 2, The map is now [[1,1]]
    println(myHashMap.get(2)) // return -1 (i.e., not found), The map is now [[1,1]]
}