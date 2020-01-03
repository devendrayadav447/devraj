/*
The following helper function can be used to convert one data type
into another:

    toByte()
    toShort()
    toInt()
    toLong()
    toFLoat()
    toDouble()
    toChar()

Note: There is No helper function available to convert
into boolean type.

 */



fun main(args: Array<String>)
{

    println("259 to byte: " + (259.toByte()))
    println("50000 to short: " + (50000.toShort()))
    println("21474847499 to Int: " + (21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    println("A to Int: " + ('A'.toInt()))
}
