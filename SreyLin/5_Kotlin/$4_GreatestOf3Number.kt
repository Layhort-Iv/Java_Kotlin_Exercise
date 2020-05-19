import java.util.Scanner

fun main() {
    var king = Scanner(System.`in`);

    println("Enter first number!")
    var f = king.nextInt();

    println("Enter second number!")
    var s = king.nextInt();

    println("Enter third number!")
    var t = king.nextInt();

    var res = if(f>s && f>t)"First number is the grestest!" else if (s>f && s>t)"Second number is the greatest!" else "Third number is the greatest!"
    println(res)
}