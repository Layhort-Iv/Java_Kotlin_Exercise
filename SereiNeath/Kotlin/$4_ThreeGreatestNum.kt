import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print("Enter 1st number: ")
    val num1 = input.nextInt()
    print("Enter 2nd number: ")
    val num2 = input.nextInt()
    print("Enter 3rd number: ")
    val num3 = input.nextInt()

    if (num1>num2){
        if(num1>num3){
            println("The $num1 is the biggest number.")
        }
        else
        {
            println("The $num3 is the biggest number.")
        }
    }
    else{
        if(num2>num3){
            println("The $num2 is the biggest number.")
        }
        else{
            println("The $num3 is the biggest number.")
        }
    }
}