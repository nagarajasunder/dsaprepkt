package problems.array

class Solution {

    fun mergeOptimized(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        var i = m - 1
        var j = n - 1
        var k = (m+n)-1

        while(j >= 0) {

            if(i >= 0 && nums2[j] > nums1[i]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
    }

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {


        var i = 0
        var j = 0
        var k = 0

        val result:IntArray = IntArray(m+n)

        while(i<m && j<n) {

            if(nums1[i] <= nums2[j]) {
                result[k] = nums1[i]
                i++
            } else {
                result[k] = nums2[j]
                j++
            }
            k++
        }

        while(i < m) {
            result[k] = nums1[i]
            i++
            k++
        }

        while(j < n) {
            result[k] = nums2[j]
            j++
            k++
        }

        result.forEachIndexed { index, i ->
            nums1[index] = i
        }
    }
}

fun main() {
    val nums1 = intArrayOf(0)
    val nums2 = intArrayOf(1)
    val s = Solution()
    s.mergeOptimized(nums1,0,nums2,1)
    nums1.forEach { print(it) }
}