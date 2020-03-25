package subtask4

import jdk.nashorn.internal.objects.NativeArray.forEach

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val result = mutableListOf<String>()
        var nothing = 0
        for (i in inputString.withIndex()) {
            if (i.value == '<' || i.value == '[' || i.value == '(') {
                var end: Char = when (i.value) {
                    '<' -> '>'
                    '[' -> ']'
                    '(' -> ')'
                    else -> ' '
                }
                for (i2 in i.index + 1 until inputString.length) {
                    if (inputString[i2] == i.value) nothing++
                    if (inputString[i2] == end) {
                        if (nothing == 0) {
                            result.add(inputString.substring(i.index + 1 until i2))
                        } else nothing--
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}