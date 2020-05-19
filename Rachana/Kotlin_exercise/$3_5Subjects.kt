import java.util.*

fun main() {
    var user_input = Scanner(System.`in`)

    //3. Write a Kotlin program to find the sum and average of 5 subjects.

    print("Enter the subject's score")
    var sub1:Int = user_input.nextInt()
    var sub2:Int = user_input.nextInt()
    var sub3:Int = user_input.nextInt()
    var sub4:Int = user_input.nextInt()
    var sub5:Int = user_input.nextInt()
    println("The score of first subject is: $sub1, Second subject is: $sub2, Third subject is: $sub3, Forth subject is: $sub4, Fifth subject is: $sub5")
    println("The sum of 5 subjects is: ${sub1+sub2+sub3+sub4+sub5} and the average of 5 subjects is:${(sub1+sub2+sub3+sub4+sub5)/5} ")
}