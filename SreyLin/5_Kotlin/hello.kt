import java.util.Scanner
fun main(args: Array<String>) {
    println("Enter a Character:")
    val sc = Scanner(System.`in`)
    val ch = sc.next()[0]

    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') "Uppercase vowel" else "consonant"

    println("$ch is $vowelConsonant")
}
