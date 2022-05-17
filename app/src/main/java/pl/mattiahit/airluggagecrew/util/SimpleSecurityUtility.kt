package pl.mattiahit.airluggagecrew.util

object SimpleSecurityUtility {

    private val HEX_CHARS = "0123456789ABCDEF".toCharArray()

    fun printHexBinary(data: ByteArray): String {
        val r = StringBuilder(data.size * 2)
        data.forEach { b ->
            val i = b.toInt()
            r.append(HEX_CHARS[i shr 4 and 0xF])
            r.append(HEX_CHARS[i and 0xF])
        }
        return r.toString()
    }
}