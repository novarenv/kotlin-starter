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
    if(!isOpen){
        println("Office is closed")
    } else{
        print("Office is open")
    }
}