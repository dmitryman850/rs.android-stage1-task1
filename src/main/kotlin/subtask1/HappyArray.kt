package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happy = sadArray.toCollection(ArrayList())
        var i = 1
        while (i  < happy.size-1) {
            if (happy[i] > happy[i-1]+happy[i+1]) {
                happy.removeAt(i)
                if(i!=1) i--
            }
        else i++
        }
        return happy.toIntArray()
    }
    //  throw NotImplementedError("Not implemented")
}