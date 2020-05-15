import java.util.Scanner;

public class CircumferenceReg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int w,l,c;

        System.out.println("Enter width: ");
        w = sc.nextInt();

        System.out.println("Enter l:");
        l = sc.nextInt();

        sc.close();
        c = 2*(w + l);
        System.out.println("Circumference of rectangle is: "+c);
    }
}
