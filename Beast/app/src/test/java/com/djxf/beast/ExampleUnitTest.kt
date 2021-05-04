package com.djxf.beast

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

        print("尹定健".stringToUnicode().unicodeToString(""))
    }

    private fun Int.toHexString(): String = Integer.toHexString(this)

    /**
     * Char --> Unicode
     */
    private fun encode(char: Char) = "\\u${char.toInt().toHexString()}"

    //String --> Unicode
    private fun String.stringToUnicode() = this
        .toCharArray()
        .joinToString(separator = "", truncated = "") {
            encode(it)
        }

    /**
     * Unicode ---> String
     */
    fun String.unicodeToString(encodeText: String): String {

        fun decode(unicode: String) = unicode.toInt(16).toChar()

        val unicodeList = this.split("\\u")
            .mapNotNull {
            if (it.isNotBlank()) {
                decode(it)
            } else {
                null
            }
        }
        return unicodeList.toCharArray().toString()

        //5c39
    }


}