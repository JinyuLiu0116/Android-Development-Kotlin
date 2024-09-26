package practice

fun main(args: Array<String>){
    var number = 10
    printNumbers(number)
}
fun printNumbers(num: Int){
    print("$num ")
    if(num == 0){
        return
    }else{
        printNumbers(num -1)
    }
}
