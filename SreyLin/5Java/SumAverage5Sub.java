import java.util.Scanner;

public class SumAverage5Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float a,b,c,d,e,f,r;

        System.out.println("Score subject a:");
        a = sc.nextFloat();
        System.out.println("Score subject b:");
        b = sc.nextFloat();
        System.out.println("Score subject c:");
        c = sc.nextFloat();
        System.out.println("Score subject d:");
        d = sc.nextFloat();
        System.out.println("Score subject e");
        e = sc.nextFloat();

        sc.close();
        f = a+b+c+d+e;
        r = f/5;
        System.out.println("Sum of 5 subject is:"+f);
        System.out.println("Average is :"+r);
    }
}
