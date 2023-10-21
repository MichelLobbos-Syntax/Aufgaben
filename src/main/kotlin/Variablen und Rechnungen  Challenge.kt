fun main() {
    /*
    Deklariere vier Variablen vom Datentyp Int mit sinnvollen Namen.
Fordere den Benutzer über die Konsole auf, seine erste Zahl und danach seine zweite Zahl einzugeben. 						   Hinweis: An dieser Stelle wird es vermutlich zu einem Fehler kommen, schau in der Vorlesung bzw. im Internet, wie man diesen behebt.
Teile die erste Zahl durch die zweite und speichere das Ergebnis in einer dritten Variable ab.
Nehme den Modulo der ersten Zahl mit Hilfe der zweiten und speichere das Ergebnis in einer vierten Variable ab.
Gebe alles in folgender Form am Ende aus:
*/

    println("Geben Sie Zahl 1 ein")
    var nummer1: Int= readln() .toInt()
    println("Geben Sie Zahl 2 ein")
    var nummer2: Int= readln() .toInt()
    var nummer3: Int= nummer1 / nummer2
    var nummer4: Int= nummer1 % nummer2
    
    println("Ergebnis: $nummer1 / $nummer2 = $nummer3  mit rest von $nummer4")





}