fun main() {

    val aboutNull = AboutNull()

    println(aboutNull.describeString(aboutNull.neverNull))
    println(aboutNull.describeString(aboutNull.nullable))

    val contact = Contact(1, "mary@gmail.com")

    println("Id of Mary is " + contact.id)
    contact.email = "jane@gmail.com"

    println()

    val aboutGenerics = AboutGenerics()

    val stack = aboutGenerics.mutableStackOf("just", "some", "test", "words")
    aboutGenerics.printSome(stack)

    val stackOfNumbers = aboutGenerics.mutableStackOf(1,2,3,4,5,6,7,8)
    aboutGenerics.printSome(stackOfNumbers)


}

class Contact(val id: Int, var email: String)