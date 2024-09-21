package homeWork.HW2
import kotlin.random.Random
fun main(){
    val choice= arrayOf("1","2","3")
    val option= arrayOf("Rock", "Paper", "Scissors")

    while(true){
        var playerInput  : String
        val playerOption: String
        val computerOption: String
        println("Enter number 1, 2, or 3 to play:")
        println("1. Rock")
        println("2. Paper")
        println("3. Scissors")
        print("Please enter your choice :")

        playerInput = readln()
        if(playerInput !in choice){
            println("Invalid input")
            continue
        }

        playerOption= getOption(playerInput, option)
        println("Player chooses: "+playerOption)
        computerOption= getOption(ComputerChoice(), option)
        println("Computer chooses: "+computerOption)

        displayResult(playerOption, computerOption)

        if(continueOrExit()){
            continue
        }
        else{
            println("Thank you for playing.")
            break
        }
    }
}
fun getOption(playerInput: String, option: Array<String> ) : String{
    var choice:String=""
    when(playerInput){
        "1" -> choice= option[0]
        "2" -> choice= option[1]
        "3" -> choice= option[2]
    }
    return choice
}
fun ComputerChoice(): String{
    val choice = Random.nextInt(1, 4)
    return choice.toString()
}
fun continueOrExit(): Boolean{
    var choice:Boolean = true
    println("Do you want to play again?")
    print("Enter 'y' to continue, 'n' to exit:")
    var input= readln()
    while(input.isEmpty() || (input[0].lowercase() !="y" && input[0].lowercase()!="n")){
        if(input.isEmpty() ){
            println("Input cannot be empty.")
            continue
        }
        if((input[0].lowercase() !="y" && input[0].lowercase()!="n")){
            println("Invalid input")
            print("Enter 'y' to continue, 'n' to exit:")
            input= readln()
        }
    }
    if(input[0].lowercase()=="y"){
        choice= true
    }
    if(input[0].lowercase()=="n"){
        choice= false
    }
    return choice
}
fun displayResult(player:String, computer:String){
    if(player=="Rock"&&computer=="Rock"){
        println("It is a Draw")
    }
    else if(player=="Rock"&&computer=="Paper"){
        println("Computer Win!")
    }
    else if(player=="Rock"&&computer=="Scissors"){
        println("Player Win!")
    }
    else if(player=="Paper"&&computer=="Rock"){
        println("Player Win!")
    }
    else if(player=="Paper"&&computer=="Paper"){
        println("It is a Draw")
    }
    else if(player=="Paper"&&computer=="Scissors"){
        println("Computer Win!")
    }
    else if(player=="Scissors"&&computer=="Rock"){
        println("Computer Win!")
    }
    else if(player=="Scissors"&&computer=="Paper"){
        println("Player Win!")
    }
    else if(player=="Scissors"&&computer=="Scissors"){
        println("It is a Draw")
    }

}
