//Sometime it is not possible to cast variable and
// it throws an exception, this is called as unsafe cast.
//Kotlin provides a safe cast operator as? for safely cast to a type. It returns a null if casting is not possible rather than throwing an ClassCastException exception.
fun main(args: Array<String>){

    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}