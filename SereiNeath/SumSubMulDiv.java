package SereiNeath;
import java.util.Scanner;

public class SumSubMulDiv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 1st number:");
        int num1 = input.nextInt();
        System.out.print("Enter a 2nd number:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1/num2;
        int remind = num1 % num2;


        System.out.printf("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d \n%d %% %d = %d",num1,num2,sum,num1,num2,sub,num1,num2,mul,num1,num2,div,num1,num2,remind);

    }
}
