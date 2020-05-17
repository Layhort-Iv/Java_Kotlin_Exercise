import java.util.Scanner

fun main() {
    var k = Scanner(System.`in`);

    println("Enter first number!")
    var f = k.nextInt();
    println("Enter second number!")
    var s = k.nextInt();

    println("Addition is  : ${f+s} \nSubtract is  : ${f-s} \nMultiple is  : ${f*s} \nDivide is    : ${f/s} \nRemainder is : ${f%s}")

}