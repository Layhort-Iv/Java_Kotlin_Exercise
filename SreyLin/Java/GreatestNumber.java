package SreyLin.Java;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter a number:");
        a = sc.nextInt();
        System.out.println("ENter a number:");
        b = sc.nextInt();
        System.out.println("Enter a number:");
        c = sc.nextInt();

        if (a>b && a>c)
            System.out.println("A is the greatest number!");
        else  if (b>a && b>c)
            System.out.println("B is the greatest number!");
        else
            System.out.println("C is the greatest number!");
        
        sc.close();
    }
}
