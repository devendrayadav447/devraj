
//In Kotlin, if is an expression is which returns a value.
// It is used for control the flow of program structure.

import java.util.Scanner

fun main(args: Array<String>) {

    // create an object for scanner class
    val reader = Scanner(System.`in`)
    print("Enter three numbers: ")

    var num1 = reader.nextInt()
    var num2 = reader.nextInt()
    var num3 = reader.nextInt()

    var max = if ( num1 > num2) {
        if (num1 > num3) {
            "$num1 is the largest number"
        }
        else {
            "$num3 is the largest number"
        }
    }
    else if( num2 > num3){
        "$num2 is the largest number"
    }
    else{
        "$num3 is the largest number"
    }
    println(max)

}
