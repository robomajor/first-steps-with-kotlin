fun main() {

    val neverNull = "This can't be null"

    val nullable: String? = null

    fun describeString(maybeString: String?): String {              // 1
        return if (maybeString != null && maybeString.isNotEmpty()) {        // 2
            "String of length ${maybeString.length}"
        } else {
            "Empty or null string"                           // 3
        }
    }
    println(describeString(neverNull))
    println(describeString(nullable))

}