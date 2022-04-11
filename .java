
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t\t  Board Percentage Calculator System");
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t\t    --------------------");
        System.out.println("\t\t      Daffodil International University");
        System.out.println("\t\t\t    --------------------");
        Scanner sc = new Scanner(System.in);
        double total = 500;
        System.out.println("Enter Your Subject's Marks:");
        System.out.println("English:");
        double a = sc.nextDouble();
        System.out.println("Bangla:");
        double b = sc.nextDouble();
        System.out.println("Math:");
        double c = sc.nextDouble();
        System.out.println("Physics:");
        double d = sc.nextDouble();
        System.out.println("Biology:");
        double e = sc.nextDouble();
        double sum = a + b + c + d;
        System.out.println("Total Marks: " + sum);
        double parcentage = (sum / total) * 100;
        System.out.println("Parcentage of a student's give mark: " + parcentage);

        System.out.println("\n*****************************************");
        System.out.println(" \t\t Thank You :) ");
        System.out.println("*****************************************");
        System.out.println("\t</> Code by Himel & Kashfea\n");
        System.exit(0);

    }
}
