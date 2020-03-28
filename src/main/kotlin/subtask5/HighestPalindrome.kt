package subtask5

import java.util.ArrayList
import kotlin.system.exitProcess

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val result = digitString.toCharArray()
        println(result)
        result[2] = '8'
        println(result)
        val a1 = result.joinToString("")
        println(a1)
        return a1
           // throw NotImplementedError("Not implemented")
    }
}
