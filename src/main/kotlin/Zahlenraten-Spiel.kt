import kotlin.random.Random

fun main() {

    var zufallZahl: Int= Random.nextInt(1,100)
    println("Herzlich Willcommen in unsere Zahlenraten-Spiel")
    println("Geben Sie Ihre Name bitte ein")
    var name: String= readln()
    println("Hallo herr $name \n" +
            "geben Sie einen Zahl ein")
    var nummer: Int= readln().toInt()

    if (zufallZahl==nummer)
        println("HUHUUUUU GLÜCKWÜNSCH herr $name, Sie haben gewonnen")
    else
        println("Das richtige Zahl ist $zufallZahl, viel Glück beim nächstes mal ")



}