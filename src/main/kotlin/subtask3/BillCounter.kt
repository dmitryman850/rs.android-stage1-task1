package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var i = 0
        val sum = (bill.sum() - bill[k])
        val sum2 = sum/2
        val changeBill = b - sum2
        if(b == sum2)
            return "Bon Appetit"
       else
            return changeBill.toString()

        //throw NotImplementedError("Not implemented")
    }
}
