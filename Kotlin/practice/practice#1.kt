package practice

fun main(args: Array<String>){
    val x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x -  y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result =  x + y
    result += 2
    println("result: $result")

    result -= 2
    println("result: $result")

    result *= 2
    println("result: $result")

    result /= 2
    println("result: $result")

    result %= 2
    println("result: $result")

    val myNumber = 100
    if(myNumber > 150){
        println("My number is greater than 150")
    }else if(myNumber > 90){
        println("My number is greater than 90")
    }else{
        println("My number is less than 90")
    }

    val isFullTimeStudent = false
    val grade = 3.6
    if(isFullTimeStudent && grade >= 3.5){
        println("You can apply the scholarship for full time student")
    }else if (!isFullTimeStudent && grade >= 3.5) {
        println("You can apply the scholarship for part time student")
    }else{
        println("You need to meet the minimum grade of 3.5")
    }

}
