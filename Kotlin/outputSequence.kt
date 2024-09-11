package hw1

fun main(){
    for(i in 10..51 step 3){
        print("$i ")
    }
    println()
    for(i in 'z' downTo 'a'){
        print("$i ")
    }
    println()

   val pattern: Int = 5
    for(i in 1..pattern+1){
        for(j in 1..i){
            print(j)
        }
        println()
    }
}