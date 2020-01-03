
fun main(args: Array<String>) {
    var num = 0
    while (num <= 12) {
        if (num % 3 == 0) {
            num++
            continue
        }
        println(num)
        num++
    }
    loop7()
}


fun loop7() {

    var num1 = 4
    outer@ while (num1 > 0) {
        num1--
        var num2 = 4

        inner@ while (num2 > 0) {
            if (num1 <= 2)
                continue@outer
            println("num1 = $num1, num2 = $num2")
            num2--
        }
    }
}
