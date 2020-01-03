// Kotlin code
fun main(args : Array<String>) {
    var myint = 35
    //add suffix L for long integer
    var mylong = 23L

    println("My integer ${myint}")
    println("My long integer ${mylong}")

    var b1: Byte = Byte.MIN_VALUE
    var b2: Byte = Byte.MAX_VALUE
    println("Smallest byte value: " +b1)
    println("Largest byte value: " +b2)

    var S1: Short = Short.MIN_VALUE
    var S2: Short = Short.MAX_VALUE
    println("Smallest short value: " +S1)
    println("Largest short value: " +S2)

    var I1: Int = Int.MIN_VALUE
    var I2: Int = Int.MAX_VALUE
    println("Smallest integer value: " +I1)
    println("Largest integer value: " +I2)

    var L1: Long = Long.MIN_VALUE
    var L2: Long = Long.MAX_VALUE
    println("Smallest long integer value: " +L1)
    println("Largest long integer value: " +L2)
    float()
    boolean()
    charc()

}


// Kotlin code
fun float() {
    var myfloat = 54F				 // add suffix F for float
    println("My float value ${myfloat}")

    var F1: Float = Float.MIN_VALUE
    var F2: Float = Float.MAX_VALUE
    println("Smallest Float value: " +F1)
    println("Largest Float value: " + F2)

    var D1: Double = Double.MIN_VALUE
    var D2: Double = Double.MAX_VALUE
    println("Smallest Double value: " + D1)
    println("Largest Double value: " + D2)
}

fun boolean(){
    if (true is Boolean){
        print("Yes,true is a boolean value")
    }
}

fun charc(){
    var alphabet: Char = 'C'
    println("C is a character : ${alphabet is Char}")
}