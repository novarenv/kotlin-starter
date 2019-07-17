enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("Value of red is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("Value of green is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("Value of blue is $value")
        }
    };

    abstract fun printValue()
}