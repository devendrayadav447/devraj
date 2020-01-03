fun main(args: Array<String>) {
    var a = 10
    var b = 5
    var c = 15
    var flag = false
    var result: Boolean
    result = (a > b) && (a > c)
    println("(a>b) && (a>c) :" + result)
    result = (a > b) || (a > c)
    println("(a>b) || (a>c) :" + result)
    result = !flag
    println("!flag :" + result)
}
