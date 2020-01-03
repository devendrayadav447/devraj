/*In Kotlin, variables are declared using two types –

    Immutable using val keyword
    Mutable using var keyword

*Immutable is also called read-only variables.
Hence, we can not change the value of the variable
declared using val keyword.
*Note:-(Immutable variable is not a constant because it can be
initialized with the value of a variable,
It means the value of immutable variable doesn’t need to be known at
compile-time, and if it is declared inside a construct that
is called repeatedly, it can take on a different value on each
function call.)
***Mutable Variables –In Mutable variable we can change the value of the variable.

*/
fun main(args: Array<String>) {
    var salary=24000
    println(salary)
    salary=30000
    println(salary)

    val language = "Java"
    println(language)

    var myBirthDate = "02/04/1998"
    val myNewBirthDate = myBirthDate
    println(myNewBirthDate)

}