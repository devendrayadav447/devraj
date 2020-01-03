fun main(args : Array<String>) {
    val a = 5
    val b = 10
    val max = if (a > b) {
        println("a is greater than b.")
        a
    } else{
        println("b is greater than a.")
        b
    }
    println("max = $max")
}