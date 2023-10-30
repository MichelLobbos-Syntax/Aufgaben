import kotlin.math.pow


fun main() {
  println("Geben Sie der Radios des Kreises")

  val π: Double= 3.14159
  var r: Double= readln().toDouble()
  println("r = $r M")
  var r2: Double = r.pow(2)
  var a: Double=π * r2
  println("der Flächeninhalt das Kreises ist, a = $a M^2")

}






