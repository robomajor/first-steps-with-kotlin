class GermanShepherd(name: String) : Dog("Drezden", name = name) {
    override fun sayHello() {
        println("HAU AUUUUU BETONIARA - said dog named $name from $origin")
    }
}