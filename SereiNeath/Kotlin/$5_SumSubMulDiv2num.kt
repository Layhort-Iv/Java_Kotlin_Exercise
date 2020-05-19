import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Enter 1st number: ")
    val num1 = input.nextInt()
    print("Enter 2nd number: ")
    val num2 = input.nextInt()

    val sum = num1 + num2
    val sub = num1 - num2
    val mul = num1 * num2
    val div = num1/num2
    val remind = num1 % num2

    print("$num1 + $num2 = $sum \n$num1 - $num2 = $sub \n$num1 * $num2 = $mul \n$num1 / $num2 = $div \n$num1 % $num2 = $remind")
}