package practice

fun main(args: Array<String>){
    var number = 10
    printNumbers(number)
    println()

    var internectConnection = true
    var myInternectState = if(internectConnection == true) ConnectionTrue() else ConnectionFalse()
    println("Your internect state: $myInternectState")

    val num1 = (1..20).random()
    val num2 = (1..20).random()
    println("Number 1: $num1")
    println("Number 2: $num2")
    val maxNum = FindMaxNum(num1, num2)
    println("Maximum number: $maxNum")
    
}
fun printNumbers(num: Int){
    print("$num ")
    if(num == 0){
        return
    }else{
        printNumbers(num -1)
    }
}
fun ConnectionTrue():String{
    return "Connected"
}
fun ConnectionFalse():String{
    return "Disconnected"
}
fun FindMaxNum(n1:Int, n2:Int, n3:Int=0, n4:Int=0, n5:Int=0):Int{
    val listOfNum = listOf(n1, n2, n3, n4, n5)
    return listOfNum.max()
