fun main() {

    infix fun Int.times(str: String) = str.repeat(this)          //Defines an infix extension function on Int
    println(2 times "Bye ")                                         //Calls the infix function

    val pair = "Ferrari" to "Katrina"                               //Creates a Pair by calling the infix function to from the standard library
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)        //different implementation of to creatively called onto
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                            //Infix notation also works on members functions (methods)
    sophia.likedPeople.forEach { (println("Sophia likes: " + it.name)) }
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(someone: Person) { likedPeople.add(someone) }      //The containing class becomes the first parameter
}