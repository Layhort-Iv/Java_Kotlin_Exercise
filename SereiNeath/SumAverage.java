package SereiNeath;
import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a BasicMath score: ");
        float  mathScore = input.nextFloat();
        System.out.print("Enter a Python score: ");
        float pythonScore = input.nextFloat();
        System.out.print("Enter a English score: ");
        float englishScore = input.nextFloat();
        System.out.print("Enter a Java score: ");
        float javaScore = input.nextFloat();
        System.out.print("Enter a HTML score: ");
        float htmlScore = input.nextFloat();

        float sum = mathScore + pythonScore + englishScore + javaScore + htmlScore;
        float average = sum/5;

        System.out.print("The sum of 5 subjects is: "+sum+ "\nThe Average of 5 subjects is: "+average);
    }
}
