package Rachana;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//1. Write a Java program to find the sum of two numbers.

        System.out.println("Enter first_number!");
        int first_number = sc.nextInt();
        System.out.println("The first_number is: "+ first_number);
        System.out.println("Enter second_number!");
        int second_number = sc.nextInt();
        System.out.println("The second_number is: "+ second_number);
        System.out.println("The sum of two number is "+ (first_number + second_number));


//2. 2. Write a Java program to find the area and circumference of a rectangle.:

        System.out.println("Enter the length and width! ");
        int length = sc.nextInt(), width = sc.nextInt();
        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("Area of circle is : " + (length * width));
        System.out.println("Circumference of a circle is : " + (2 * length * width ));


//3. Write a Java program to find the sum and average of 5 subjects.
        System.out.println("Enter the score for 5 subjects by prime number!");
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        int score4 = sc.nextInt();
        int score5 = sc.nextInt();
        System.out.println("First_subject : " + score1);
        System.out.println("Second_subject : " + score2);
        System.out.println("Third_subject : " + score3);
        System.out.println("Fourth_subject : " + score4);
        System.out.println("Fifth_subject : " + score5);

        System.out.println("The total score of 5 subject is : "+ (score1 + score2 + score3 + score4 + score5));
        System.out.println("Average of 5 subject is : " + (double)(score1 + score2 + score3 + score4 + score5) / 5);

//4. Write a Java program to find the greatest among three numbers by using if statement.
        System.out.println("Enter 3 numbers!");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Number1 : " + num1);
        System.out.println("Number2 : " + num2);
        System.out.println("Number3 : " + num3);

        if (num1>num2 && num1>num3){
            System.out.println("Number1 is the greatest number.");
        }else if (num2>num1 && num2>num3){
            System.out.println("Number2 is the greatest number.");
        }else if (num3>num1 && num3>num2){
            System.out.println("Number3 is the greatest number.");
        }

//5. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

        System.out.println("Enter first number!");
        int first_num = sc.nextInt();
        System.out.println("First number is: "+ first_num);
        System.out.println("Enter the second number!");
        int second_num = sc.nextInt();
        System.out.println("second number is: "+ second_num);

        System.out.println("The sum of these number is: "+ (first_num + second_num));
        System.out.println("The subtract of these number is: "+(first_num - second_num));
        System.out.println("The multiply of these number is: "+ (first_num * second_num));
        System.out.println("The division of these number is: "+ (first_num / second_num));
        System.out.println("The remainder of these number is: "+ (first_num % second_num));

        sc.close();
    }
}
