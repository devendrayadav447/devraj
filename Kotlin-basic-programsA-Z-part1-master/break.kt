fun main(args: Array<String>) {

    var name = "Hai JRS"
    for (i in name){
        print("$i")
        if(i == 'R') {
            break
        }
    }
    loop5()
}

fun loop5() {
    outer@ for (num1 in 4 downTo 1) {

        inner@ for (num2 in 4 downTo 1) {
            if (num1 == 2)
                break@outer
            println("num1 = $num1; num2 = $num2")
        }
    }
}
