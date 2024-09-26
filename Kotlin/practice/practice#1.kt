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
    println()

    val numA = (1..30).random()
    val numB = (1..30).random()
    if(numA == numB) println("Number $numA is equal to number $numB")
        else if (numA > numB) println("Number $numA is greater than number $numB")
            else println("Number $numA is less tham number $numB:)
    println()

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

    val letterGrade = 'A'
    when (letterGrade) {
        'A' -> println("Score is between 91 and 100")
        'B' -> println("Score is between 81 and 90")
        'C' -> println("Score is between 71 and 80")
        'D' -> println("Score is between 61 and 70")
        'E' -> println("Score is equal to 60")
        'F' -> println("Work harder!")
        else -> println("Invalid")
    }

    val score = 98
    val letterGrade : Char
    when(score){
        in 91..100 -> letterGrade = 'A'
        in 81..90 -> letterGrade = 'B'
        in 71..80 -> letterGrade = 'C'
        in 61..70 -> letterGrade = 'D'
        60 -> letterGrade = 'E'
        in 0..59 -> letterGrade = 'F'
        else -> println("Invalid")
    }
    println("Letter grade: $letterGrade")

    val letterGrade2 = when(score){
        in 91..100 -> 'A'
        in 81..90 -> 'B'
        in 71..80 -> 'C'
        in 61..70 -> 'D'
        60 -> 'E'
        in 0..59 -> 'F'
        else -> println("Invalid")
    }
    println("Letter grade 2: $letterGrade2")

    var text1 : String? = null
    var text2 = ""
    if(text1 != null){
        text2 = text1
    }else{
        text2 = "The variable is null"
    }
    println("Text 2: $text2")

    var text3 : String? = null
    text3 = "This variable is not null"
    val text4 : String = text3 ?: "The variable is null"

    laterinit var name : String
    while(true){
        print("Please enter your name:)
        name = readLine()
        if(name.isEmpty()){
            println("Name cannot be empty.")
            continue
        }
        else if(!name.all{it.isLetter()}){
            println("Only alphabets letters are allowed.")
            continue
        }
        else
              break
    }
    println("Hello $name")

    var mMapFruits = mutableMapOf(
        1 to "Apple",
        3 to "Banana",
        6 to "Watermelon",
        5 to "Peach"
    )
    println("Fruits: $mMapFruits")
    mMapFruits[4] = "BlueBerry"
    mMapFruits = mMapFruits.toSortedMap()
    println("Fruits: $mMapFruits")
}
