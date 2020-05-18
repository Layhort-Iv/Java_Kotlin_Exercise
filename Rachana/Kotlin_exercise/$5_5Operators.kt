import java.util.*

fun main() {
    //5. Write a Kotlin program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    var user_input = Scanner(System.`in`)
    println("Insert the numbers!")
    var Num1:Int = user_input.nextInt()
    var Num2:Int = user_input.nextInt()
    println("The sum of two number is:${Num1+Num2} , The subtract of two number is: ${Num1-Num2}, The divide of two number is: ${Num1/Num2}")
    println(" The multiply of two number is: ${Num1*Num2}, The remainder of the two numbers is: ${Num1%Num2}")

}