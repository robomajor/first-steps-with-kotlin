class AboutGenerics {

    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

    fun <E> printSome(testStack: MutableStack<E>) {
//        val testStack = stack
        println(testStack.toString())
        println("is testStack empty? - " + testStack.isEmpty())
        println("last word of testStack - " + testStack.peek())
        testStack.push(testStack.first())
        println("new last word of testStack - " + testStack.peek())
        testStack.pop()
        testStack.pop()
        println("size after pop: " + testStack.size())
        println(testStack.toString())
        println()
    }

    class MutableStack<E>(vararg items: E) {

        private val elements = items.toMutableList()

        fun push(element: E) = elements.add(element)

        fun peek(): E = elements.last()

        fun first(): E = elements[1]

        fun pop(): E = elements.removeAt(elements.size - 1)

        fun isEmpty() = elements.isEmpty()

        fun size() = elements.size

        override fun toString() = "MutableStack(${elements.joinToString()})"
    }

}
