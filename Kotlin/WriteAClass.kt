package homeWork.HW2

open class Animal (
    private var  Name: String,
    private var Weight: Double,
    private var Age: Int,
    private var Breed: String
){
    fun getName():String{
        return this.Name
    }
    fun setName(name:String){
            this.Name = name
    }
    fun getBreed():String{
        return this.Breed
    }
    fun getWeight():Double{
        return this.Weight
    }
    fun setWeight(weight:Double){
        this.Weight=weight
    }
    fun getAge():Int{
        return this.Age
    }
    fun setAge(age:Int){
        this.Age=age
    }
    fun displayInfor(){
        println("Name: ${this.getName()}\nWeight: ${this.getWeight()} Pounds\nAge: ${this.getAge()} yeas old\nBreed: ${this.getBreed()}")
    }
    open fun makeSound(){
        println("${this.getName()} maks sound")
    }
}
class Dog(Name: String, Weight: Double, Age: Int, Breed: String="Dog") : Animal(Name, Weight, Age,Breed){
    override fun makeSound() {
        println("Woof! Woof!")
    }
}
class Cat(Name: String, Weight: Double, Age: Int, Breed: String="Cat") : Animal(Name, Weight, Age,Breed){
    override fun makeSound() {
        println("Meow~ Meow~")
    }
}
fun main(){
    val animals= listOf(
        Dog("Tiggy", 15.5, 3),
        Cat("Rokt", 7.6, 7)
    )
    for(animal in animals){
        animal.displayInfor()
        animal.makeSound()
        println()
    }

}