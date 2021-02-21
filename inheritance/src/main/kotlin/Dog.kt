open class Dog(val origin: String, val name: String) {
    open fun sayHello() {
        println("hau hau! - said dog named $name from $origin")
    }
}