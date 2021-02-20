fun main() {

    val aboutNull = AboutNull()

    println(aboutNull.describeString(aboutNull.neverNull))
    println(aboutNull.describeString(aboutNull.nullable))

}