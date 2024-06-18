package problems.array

fun maxProfit(prices: IntArray): Int {

    var profit = 0
    var buy = prices[0]

    for (i in prices.indices) {

        if(prices[i] < buy) {
            buy = prices[i]
        }
        if (prices[i] - buy > profit) {
            profit = prices[i] - buy
        }
    }
    println("Lowest buy ${buy}")
    return profit
}

fun main() {
    println(maxProfit(intArrayOf(7,4,5,3,6,1,8)))
}