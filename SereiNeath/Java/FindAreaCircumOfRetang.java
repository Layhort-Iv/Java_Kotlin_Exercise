package SereiNeath.Java;
import java.util.Scanner;

public class FindAreaCircumOfRetang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Length of Rectangle:");
        float length = input.nextFloat();
        System.out.println("Enter a Width of Rectangle:");
        float width = input.nextFloat();
        input.close();
        
        float area = length * width;
        float circum = 2 * (length + width);

        System.out.printf("The area of Rectangle is %.2f and the circumference of Rectangle is %.2f",area,circum);
    }
}
