import java.lang.reflect.Array

fun main() {
    name()
    valvar()
    plus()
    char()
    string()
    array()
    function("Novaren Veraldo", 19)
    ifExpression()
    boolean()
    numbers()
    nullable()
    safeCalls()
    elvisOp()
    stringTemplate()
    enum()
}

fun name() {
    val name = "Varen"

    print("My Name is ")
    println(name)
}

fun valvar() {
    var campus: String = "ITS"
    campus = "PENS"
    println("Kampus saya " + campus)

    //val final
    val company = "ITS"
    //company = "PENS"
}

fun plus() {
    val firstWord = "Novaren"
    val lastWord = "Veraldo"
    println(firstWord + " " + lastWord)

    val valueA = 11
    val valueB = 22
    println(valueA + valueB)
}

fun char() {
    var huruf = 'A'
    println("Vocal " + huruf++)
    println("Vocal " + huruf++)
    println("Vocal " + huruf++)
    println("Vocal " + huruf--)
    println("Vocal " + huruf--)
    println("Vocal " + huruf--)
    println("Vocal " + huruf--)
}

fun string() {
    val text = "Kotlin"
    val firstChar = text[0]

    println("First character of Kotlin is $firstChar")
    for (char in text) {
        print("$char ")
    }
    print("\n")

    val statement = "Kotlin is \"Awesome!\""
    println(statement)

    val unicode = "Unicode test: \u0394"
    println(unicode)

    val lines = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(lines)
}

fun array() {
    val array = arrayOf(1, 3, 5, 7)
    for (i in array) {
        print("$i ")
    }
    print("\n")

    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)
    for (i in mixArray) {
        print("$i ")
    }
    print("\n")

    val intArray = intArrayOf(1, 3, 5, 7)
    for (i in intArray) {
        print("$i ")
    }
    print("\n")

    val intArrayLambda = Array(4, { i -> i * i })
    for (i in intArrayLambda) {
        print("$i ")
    }
    print("\n")
}

fun function(name: String, age: Int) {
    println("Your name is $name and you are $age years old")
}

fun ifExpression() {
    val openHours = 7
    val now = 20
    val office: String
    office = if (now > openHours) {
        "Office already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    println(office)
}

fun boolean() {
    val officeOpen = 7
    val officeClose = 16
    val now = 10

    var isOpen = if (now >= officeOpen && now <= officeClose) {
        true
    } else {
        false
    }
    println("Office is open: $isOpen")

    isOpen = now < officeOpen || now > officeClose
    println("Office is closed: $isOpen")

    isOpen = now > officeOpen
    if (!isOpen) {
        println("Office is closed")
    } else {
        print("Office is open")
    }
    println()
}

fun numbers() {
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val overRangeInt = maxInt + 1
    val numberOne = 29
    val numberTwo = 10
    val byteNumber: Byte = 1
    val intNumber = byteNumber.toInt()
    val stringNumber = "23"
    val readableNumber = 1_000_000

    println("Max Int is $maxInt")
    println("Min Int is $minInt")
    println("Over range Int is $overRangeInt")
    println(numberOne + numberTwo)
    println(numberOne / numberTwo)
    println(intNumber)
    println(intNumber + stringNumber.toInt())
    println(readableNumber)
}

fun nullable() {
    val text: String? = null

    if (text != null) {
        val textLength = text.length
        println(textLength)
    } else {
        println("Text is null")
    }
}

fun safeCalls() {
    val text: String? = null
    println(text?.length)
}

fun elvisOp() {
    val text: String? = null
    val textLength = text?.length ?: 7
    println(textLength)
}

fun stringTemplate() {
    val hour = 7
    println(
        "Office ${if (hour > 7) {
            "already close"
        } else {
            "is open"
        }}"
    )
}

fun enum() {
    val colorRed: Color = Color.RED
    println(colorRed)

    val colors = Color.values()
    colors.forEach { color ->
        println(color)
    }

    val colorGreen: Color = Color.valueOf("GREEN")
    println("Color is $colorGreen")

    val enumColors = enumValues<Color>()
    enumColors.forEach { enumColors ->
        println(enumColors)
    }

    val enumColorGreen: Color = Color.valueOf("GREEN")
    println("Color is $enumColorGreen")

    println("Position GREEN is ${colorGreen.ordinal}")

    when (colorRed) {
        Color.RED -> println("Color is Red")
        Color.GREEN -> println("Color is Green")
        Color.BLUE -> println("Color is Blue")
    }
}