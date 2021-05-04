package com.djxf.beast

/**
 * Kotlin 语言使用16位Unicode字符集作为编码方式。
 *
 */
object BeastUtil {

    private val list: List<String> = listOf("嗷","呜","啊","~")

    /**
     * 文字转换成兽语
     */
    fun strToBeastLan(str: String): String {
        val charArr: List<String> = str.split("").filter {
            it != ""
        }
        var unicodeStr = ""
        charArr
            .map {
                var str = it.stringToUnicode()
                println("str: $str")
                while (str.length < 4){
                    str = "0$str"
                }
                unicodeStr += str
            }

        println("unicodeStr: $unicodeStr")
        var k = 0
        val unicodeHexStr = unicodeStr.split("").filter {
            it != ""
        }
        var beastStr = ""
        for (i in unicodeHexStr.indices) {
            if (unicodeHexStr[i] == "") {
                continue
            }
            println("unicodeHexStr[$i]: ${unicodeHexStr[i]}")
            println("toInt(16): " + unicodeHexStr[i].toInt(16))
            k = unicodeHexStr[i].toInt(16) + (i % 0x10)
            if (k >= 0x10) {
                k -= 0x10
            }
            beastStr += list[k / 4] + list[k % 4]
        }
        return "~呜嗷" + beastStr + "啊"
    }

    private fun Int.toHexString(): String = Integer.toHexString(this)

    /**
     * Char --> Unicode
     */
    private fun encode(char: Char) = "${char.toInt().toHexString()}"

    //String --> Unicode
    private fun String.stringToUnicode() = this
        .toCharArray()
        .joinToString(separator = "", truncated = "") {
            encode(it)
        }

    /**
     * 解码
     * 兽语解码成文字
     */
    fun beastLanToString(beastLan: String): String {
        val beastStr = beastLan.substring(3, beastLan.length - 1)
        var unicodeHexStr = ""
        val beastStrArr = beastStr.split("").filter { it != "" }
        for (i in 0..beastStr.length - 2 step(2) ) {
            var beastCharStr = ""
            beastCharStr = beastStrArr[i]
            var pos1 = 0
            while (pos1 <= 3) {
                if (beastCharStr == list[pos1]) {
                    break
                }
                pos1++
            }
            var pos2 = 0
            beastCharStr = beastStrArr[i + 1]
            while (pos2 <= 3) {
                if (beastCharStr == list[pos2]) {
                    break
                }
                pos2++
            }

            val k = pos1 * 4 + pos2
            var unicodeHexCharValue = k - ((i / 2).toInt() % 0x10)
            if (unicodeHexCharValue < 0) {
                unicodeHexCharValue += 0x10
            }
            unicodeHexStr += unicodeHexCharValue.toString(16)
        }

        var rawStr = ""
        var start = 0
        var end = 4
        while (end <= unicodeHexStr.length) {
            var charHexStr = unicodeHexStr.substring(start, end)
            var charStr = Character(charHexStr.toInt(16).toChar())
            rawStr += charStr
            start += 4
            end += 4
        }
        return rawStr
    }
}
