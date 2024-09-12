package practice

fun main(){
    val numRand =(0..20).random()
    println(numRand)

    val num = 1.rangeTo(20)
    for(i in num){
        print("$i ")
    }

    println()
    var array = arrayOf (1,2,3,4,5,6,7)
    val list = listOf(5, 6,4,4,2,1)
    print("list: ")
    for(i in list)
        print("$i ")

    println()
    fun sum(num1: Int, num2: Int):Int = num1+num2
    var n1 = (1..10).random()
    var n2 = (2..20).random()
    var sum: Int
    sum=sum(n1,n2)
    println("Sum of $n1 and $n2 is: $sum")

    fun sayHello() = "Hello"
    var say : String
    say=sayHello()
    println(say)
}