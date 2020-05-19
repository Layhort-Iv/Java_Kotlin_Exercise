import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print("Enter Math Score: ")
    val math = input.nextFloat()
    print("Enter Python Score: ")
    val python = input.nextFloat()
    print("Enter Kotlin Score: ")
    val kotlin = input.nextFloat()
    print("Enter English Score: ")
    val english = input.nextFloat()
    print("Enter Java Score: ")
    val java = input.nextFloat()

    val sum = math + python + kotlin + english + java
    val average = sum/ 5


    println("The sum of 5 subjects: $sum")
    println("The average of 5 subjects: $average")
}