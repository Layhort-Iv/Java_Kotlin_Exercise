import java.util.Scanner

fun main() {
    println("Enter length!")
    var a = Scanner(System.`in`);
    var l = a.nextInt();

    println("Enter width!")
    var w = a.nextInt();

    var res  = l*w;
    var resu = 2*(l+w);
    println("Area is : $res \nCircumference is : $resu")
}