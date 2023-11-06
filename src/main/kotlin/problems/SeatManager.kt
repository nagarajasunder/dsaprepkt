import java.util.PriorityQueue
import java.util.Queue
import javax.management.Query

class SeatManager(n: Int) {

    private var last = 0
    private val queue: Queue<Int> = PriorityQueue()


    fun reserve(): Int {
        if (queue.isEmpty()) {
            return ++last
        } else {
            return queue.poll()
        }
    }

    fun unreserve(seatNumber: Int) {
        if (seatNumber == last) {
            last--
        } else {
            queue.offer(seatNumber)
        }
    }

}

fun main() {

}

/**
 * Your SeatManager object will be instantiated and called as such:
 * var obj = SeatManager(n)
 * var param_1 = obj.reserve()
 * obj.unreserve(seatNumber)
 */