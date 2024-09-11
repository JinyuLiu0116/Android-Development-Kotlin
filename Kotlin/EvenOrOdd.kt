package hw1

fun main(){
    print("Enter an positive Integer number:")
    var input : String
    input = readln()
    while(input.isEmpty() || input.toIntOrNull()==null||input.toInt()<0){
        if(input.isEmpty()) {
            println("Input cannot be empty!")
            print("Enter an positive Integer number:")
            input = readln()
        }
        else if(input.toIntOrNull()==null){
            println("Invalid input!")
            print("Enter an positive Integer number:")
            input = readln()
        }
        else if(input.toInt()<0){
            println("Number cannot be negative!")
            print("Enter an positive Integer number:")
            input = readln()
        }
    }
    val num=input.toInt()
    if(num%2==0){
        println("Input number ($num) is an Even number")
    }
    else{
        println("Input number ($num) is an Odd number")
    }
}
