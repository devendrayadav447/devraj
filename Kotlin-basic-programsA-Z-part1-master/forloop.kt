//Iterate through range using for loop –
fun main(args: Array<String>)
{
    for (i in 1..6) {
        print("$i ")
    }
    loop2()
    loop3()
    loop4()
}
//Iterate through range to jump using step-3 :
fun loop2()
{
    for (i in 1..10 step 3) {
        print("$i ")
    }
}

//Iterate through Range from top to down with using downTo and step 3:
fun loop3()
{
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }


}

//Iterate through string using for loop –
fun loop4() {
    var name = "ABC"
    var name2 = "DEF"

    // traversing string without using index property
    for (alphabet in name) print("$alphabet ")

    // traversing string with using index property
    for (i in name2.indices) print(name2[i]+" ")
    println(" ")

    // traversing string using withIndex() library function
    for ((index,value) in name.withIndex())
        println("Element at $index th index is $value")
}

