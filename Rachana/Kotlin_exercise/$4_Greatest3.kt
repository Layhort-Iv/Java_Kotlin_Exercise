import java.util.*

fun main() {
    var user_input = Scanner(System.`in`)


    println("Enter 3numbers!")
    var first_num:Int = user_input.nextInt()
    var second_num:Int = user_input.nextInt()
    var third_num:Int = user_input.nextInt()
    println("The first number is: $first_num, Second number is: $second_num, Third number is: $third_num")
    if (first_num>second_num && first_num>third_num) {
        print("The first number is the biggest")
    }
    else if (second_num>first_num && second_num>third_num) {
        print("The Second number is the biggest")
    }
    else if (third_num>first_num && third_num>second_num){
        print("The third number is the biggest")
    }
}