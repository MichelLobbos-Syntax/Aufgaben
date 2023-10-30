       import kotlin.math.max
fun main() {




    println("Geben Sie Die erste Zahl ein")
    var zahl1: Int= readln().toInt()
    println("Die erste Zahl: $zahl1")
    println("Geben Sie Die zweite Zahl ein ")
    var zahl2: Int= readln().toInt()
    println("Die zweite Zahl: $zahl2")
    println("Geben Sie Die driete Zahl ein")
    var zahl3: Int= readln().toInt()
    println("Die driete Zahl: $zahl3")
    var maxOf: Int = maxOf(a = zahl1 , b = zahl2 , c=  zahl3)
    println("Die größte Zahl ist $maxOf")


}