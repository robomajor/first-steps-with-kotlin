class SomeFunctionsAboutNumbers {

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a+b}")
    }

    fun biggerOfTwo(a: Int, b: Int) {
        val max = if (a > b) a else b
        println("bigger number is $max")
    }

    fun biggerOfTwoOneLine(a: Int, b: Int) = println("bigger number is ${if (a > b) a else b}")

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            print("object is string and it lenght is ")
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        println("object is not a string")
        return null
    }
}