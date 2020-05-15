package SreyLin.Java;
import java.util.Scanner;

public class SumTwoNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int first = sc.nextInt();

        System.out.println("Enter second number:");
        int second = sc.nextInt();

        sc.close();
        int sum = first + second;
        System.out.println("Sum of two numbers is: "+sum);

    }
}
