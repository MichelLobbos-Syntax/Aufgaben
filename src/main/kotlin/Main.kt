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





}