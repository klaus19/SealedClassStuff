sealed class Generation {
    abstract class Meow : Generation()
    abstract class Dog : Generation()

    abstract fun getFood()
}
fun myFeed(generation: Generation):String{

    return when(generation){
        is Generation.Meow -> "Hello M"
        is Generation.Dog -> "Hello D"
    }
}


