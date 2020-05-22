package SereiNeath.Java;
import java.util.Scanner;

public class SumTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input from User
        System.out.println("Enter first number: ");
        int user = input.nextInt();
        System.out.println("Enter second number: ");
        int user1 = input.nextInt();
        input.close();
        int user2 = user + user1;
        System.out.print("The sum of 2 number is: "+user2);

    }
}
