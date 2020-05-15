package SereiNeath;
import java.util.Scanner;

public class ThreeGreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter a third number:");
        int num3 = input.nextInt();

        if (num1 > num2){
            if (num1 > num3){
                System.out.printf("%d is the greatest number.", num1);

            }
            else{
                System.out.printf("%d is the greatest number.", num3);
            }
        }else{
            if (num2 > num3) {
                System.out.printf("%d is the greatest number", num2);
            }
            else {
                System.out.printf("%d is the greatest number", num3);
            }
        }
    }
}
