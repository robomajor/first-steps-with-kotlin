fun main() {
    println("Hello World!")

    val numbers = SomeFunctionsAboutNumbers()

    numbers.printSum(4,12)
    numbers.biggerOfTwo(5,8)
    numbers.biggerOfTwoOneLine(4,9)
    numbers.getStringLength("kilo")


    val notNull = PrintIfNotNull()

    notNull.printSumIfNumber("8", "80")


    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

    var a = 1
    val s1 = "number is $a"
    println(s1)
    a += 1
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    printNumberBeforeAndAfterChange(5,7)


}

fun printNumberBeforeAndAfterChange(number: Int, change: Int) = println("number was $number but after change is ${number+change}")




