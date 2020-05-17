import java.util.Scanner

fun main() {
    var full = Scanner(System.`in`);

    println("Enter score for Math!")
    var m = full.nextInt();
    println("Enter score for Network!")
    var n = full.nextInt();
    println("Enter score for Python!")
    var p = full.nextInt();
    println("Enter score for English!")
    var e = full.nextInt();
    println("Enter score for Java!")
    var j = full.nextInt();

    println("Sum is : ${m+n+p+e+j} \nAverage is : ${(m+n+p+e+j)/5}")

}