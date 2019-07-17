fun main() {
    name()
    valvar()
    plus()
    char()
    string()
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