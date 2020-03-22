package subtask2

class MiniMaxSum {


    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val mini = input.min()
        val maxi = input.max()
        val sum = input.sum()
        return intArrayOf(sum-maxi!!, sum-mini!!)
    }
}
