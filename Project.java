
import java.util.Scanner;

public class Project {

    public static void main(String args[]) {
        System.out.println("\t\t***************************************************");
        System.out.println("\t\t\tBoard Percentage Calculator System");
        System.out.println("\t\t***************************************************");
        System.out.println("\t\t\t    -----------------------");
        System.out.println("\t\t\tDaffodil International University");
        System.out.println("\t\t\t    -----------------------");

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the marks of 3 subjects (out of 100)");

            System.out.println("Enter the marks of subject 1:");

            int sub1 = sc.nextInt();

            System.out.println("Enter the marks of subject 2:");

            int sub2 = sc.nextInt();
            System.out.println("Enter the marks of subject 3:");

            int sub3 = sc.nextInt();

// Total
            int total = sub1 + sub2 + sub3;

            System.out.println("Total Marks:= " + total);

// Percentage
            float percent = (float) total / 300 * 100;

            System.out.println("Percentage = " + percent);

// Highest Marks
            if (sub1 > sub2 && sub1 > sub3) {

                System.out.println("Highest marks scored is " + sub1);

            } else if (sub2 > sub1 && sub2 > sub3) {

                System.out.println("Highest marks scored is " + sub2);

            } else {
                System.out.println("Highest marks scored is " + sub3);
            }

// Lowest Marks
            if (sub1 < sub2 && sub1 < sub3) {

                System.out.println("Lowest marks scored is " + sub1);

            } else if (sub2 < sub1 && sub2 < sub3) {

                System.out.println("Lowest marks scored is " + sub2);

            } else {
                System.out.println("Lowest marks scored is " + sub3);
            }
// Average
            float avg = (float) total / 3;

            System.out.println("Average is " + avg);

            System.out.println("\t\t***************************************************");
            System.out.println("\t\t\t              THANK YOU");
            System.out.println("\t\t***************************************************");
            System.out.println("\t\t\t    -----------------------------");
            System.out.println("\t\t\t      </>Code by Himel & Kashfea");
            System.out.println("\t\t\t    -----------------------------");

        }

    }

}
