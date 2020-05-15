package SreyLin.Java;
import java.util.Scanner;

public class EverythingOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a,b,A,S,M,D,R;
            System.out.println("Enter first number:");
            a = sc.nextInt();
            System.out.println("Enter second number:");
            b = sc.nextInt();

            sc.close();
            A = a+b;
            S = a-b;
            M = a*b;
            D = a/b;
            R = a%b;
            System.out.println(a+"+"+b+"="+A);
            System.out.println(a+"-"+b+"="+S);
            System.out.println(a+"*"+b+"="+M);
            System.out.println(a+"/"+b+"="+D);
            System.out.println(a+"%"+b+"="+R);


    }
}
