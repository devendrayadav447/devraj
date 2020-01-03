/*
Kotlin standard input is the basic operation performed to flow byte streams from input device such as Keyboard to the main memory of the system.
You can take input from user with the help of the following function:
we use readline() function for take the input()
readline()!! take the input as a string and followed by (!!)
to ensure that the input value is not null.
 */


fun main(args : Array<String>) {
    print("Enter text: ")
    var input = readLine()
    print("You entered: $input")
    print("Enter an Integer value: ")
    val string1 = readLine()!!

    // .toInt() function converts the string into Integer
    var integerValue: Int = string1.toInt()
    println("You entered: $integerValue")

    print("Enter a double value: ")
    val string2= readLine()!!

    // .toDouble() function converts the string into Double
    var doubleValue: Double = string2.toDouble()
    println("You entered: $doubleValue")
}
