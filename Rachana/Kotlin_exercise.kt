import java.util.*

fun main(args:Array<String>) {
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

    //2. Write a Kotlin program to find the area and circumference of a rectangle.:

    println("Enter length and width of rectangle!")
    var length:Int = user_input.nextInt()
    var width:Int = user_input.nextInt()
    println("Length: $length, width: $width")
    println("Area of rectangle is ${length*width} and the circumference of a rectangle is ${2*(length+width)}")

    //3. Write a Kotlin program to find the sum and average of 5 subjects.

    print("Enter the subject's score")
    var sub1:Int = user_input.nextInt()
    var sub2:Int = user_input.nextInt()
    var sub3:Int = user_input.nextInt()
    var sub4:Int = user_input.nextInt()
    var sub5:Int = user_input.nextInt()
    println("The score of first subject is: $sub1, Second subject is: $sub2, Third subject is: $sub3, Forth subject is: $sub4, Fifth subject is: $sub5")
    println("The sum of 5 subjects is: ${sub1+sub2+sub3+sub4+sub5} and the average of 5 subjects is:${(sub1+sub2+sub3+sub4+sub5)/5} ")

    //4. Write a Kotlin program to find the greatest among three numbers by using if statement.

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

    //5. Write a Kotlin program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

    println("Insert the numbers!")
    var Num1:Int = user_input.nextInt()
    var Num2:Int = user_input.nextInt()
    println("The sum of two number is:${Num1+Num2} , The subtract of two number is: ${Num1-Num2}, The divide of two number is: ${Num1/Num2}")
    println(" The multiply of two number is: ${Num1*Num2}, The remainder of the two numbers is: ${Num1%Num2}")


}