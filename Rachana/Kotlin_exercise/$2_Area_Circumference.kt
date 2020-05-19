import java.util.*

fun main() {
    var user_input = Scanner(System.`in`)

    //2. Write a Kotlin program to find the area and circumference of a rectangle.:

    println("Enter length and width of rectangle!")
    var length:Int = user_input.nextInt()
    var width:Int = user_input.nextInt()
    println("Length: $length, width: $width")
    println("Area of rectangle is ${length*width} and the circumference of a rectangle is ${2*(length+width)}")
}