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

    val num1 = 5
    val num2 = -5
    println("Number 1: $num1")
    println("Number 2: $num2")
    val text = if(num1 > 0 || num2 >0){
        println("The condition is true, one of the two numbers is grater than 0")
        "This is true condition"
    }else{
        println("The condition is false, none of the two numbers is grater tham 0")
        "This is false condition"
    }
    println("Text: $text")

    val num3 = if(num1 > num2) num1 else num2
    println("Number 3: $num3")

    val condition = true
    val result : String = if(condition == true) "condition is true" else "condition is false"
    println("Result: $result")
    
    val result2 = if(condition == true) "condition is true" else -1
    println("Result 2: $result2")
}
