import java.util.*

fun main(args: Array<String>){
    val input = Scanner(System.`in`)

    println("Enter a length of Rectangle: ")
    val length = input.nextFloat()
    println("Enter a width of Rectangle: ")
    val width = input.nextFloat()

    val area = length * width
    val circum = 2 * (length + width)
    println("The area of Rectangle: $area")
    println("The circumconference of Rectangle: $circum")
}