package practice

fun main(args: Array<String>){
    var number = 10
    printNumbers(number)
    println()

    var internectConnection = true
    var myInternectState = if(internectConnection == true) ConnectionTrue() else ConnectionFalse()
    println("Your internect state: $myInternectState")
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
