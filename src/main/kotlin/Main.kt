<<<<<<< HEAD
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program   arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
=======
fun main() {
    println("Moin wie heißt du? Enter")

    var name = readln()
    println("Hallo $name!")

    println("Wie schwer bist du $name? (in Kilogramm bitte)")
    var gewicht = readln().toFloat()
    println("Wie Größ bist du? (in Meter bitte)")

    var größe = readln() .toFloat()

    var BMI = gewicht / (größe * größe)
    println("BMI = $BMI")





>>>>>>> fe61efb (BMI)
}