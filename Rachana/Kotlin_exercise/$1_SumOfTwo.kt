import java.util.*

fun main() {
    var num1: Int
    var num2: Int
    var user_input = Scanner(System.`in`)
    //1. Write a Kotlin program to find the sum of two numbers.
    println("Enter the numbers!")
    num1 = user_input.nextInt()
    num2 = user_input.nextInt()
    println("First number is: $num1")
    println("Second number is: $num2")
    println("The sum of two number is : ${num1+num2}")
}