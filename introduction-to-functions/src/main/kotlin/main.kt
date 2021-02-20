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


    operator fun String.get(range: IntRange) = substring(range)     //An operator function allows easy range access on strings
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

    fun printAll(vararg messages: String) {                         // The vararg modifier turns a parameter into a vararg
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")    //This allows calling printAll with any number of string arguments

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "yellow", "curved", "fruits", "tasty", "a deadly weapons",
        prefix = "Bananas are "
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }

    log("just", "some", "test", "words")
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(someone: Person) { likedPeople.add(someone) }      //The containing class becomes the first parameter
}