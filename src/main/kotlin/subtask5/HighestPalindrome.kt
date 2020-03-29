package subtask5

import java.util.ArrayList

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var list: ArrayList<Int> = ArrayList()
        for (char in digitString.toCharArray()) {
            list.add(char.toInt() - '0'.toInt())
        }
        var change = 0
        var i = 0
        var max: Int
        for (i in 0 until n / 2) {
            if (list[i] !== list[n - 1 - i]) {
                change++
            }
        }
        println("a равно $change")

        when (true) {
            k == change -> {
                for (i in 0 until n / 2) {
                    if (list[i] != list[n - 1 - i]) {
                        if (list[i] > list[n - 1 - i])
                            list[n - 1 - i] = list[i]
                        else list[i] = list[n - 1 - i]
                    }
                }
            }
            k < change -> {
                return "-1"
            }
            k > change -> {
                for(i in 0 until change) {
                    list[i] = 9
                    list[n-1-i]
                }
                for (i in 0 until n / 2) {
                        if (list[i] != list[n - 1 - i]) {
                            max = maxOf(list[i], list[n - 1 - i])
                            if (list[i] != max)
                                list[i] = list[n - 1 - i]
                                else list[n-1-i] = list[i]
                            }
                        }
                    }
                }
            println(list)
                return list.joinToString("")
            throw NotImplementedError("Not implemented")
    }
}

