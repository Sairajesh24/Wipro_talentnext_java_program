package FlowControlStatements;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept gender from user
        System.out.print("Enter gender (Male/Female): ");
        String gender = scanner.nextLine();

        // Accept age from user
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        double interestPercentage;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interestPercentage = 8.2;
            } else if (age >= 59 && age <= 100) {
                interestPercentage = 9.2;
            } else {
                System.out.println("Invalid age for female.");
                scanner.close();
                return;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interestPercentage = 8.4;
            } else if (age >= 59 && age <= 100) {
                interestPercentage = 10.5;
            } else {
                System.out.println("Invalid age for male.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid gender.");
            scanner.close();
            return;
        }

        System.out.println("Interest percentage: " + interestPercentage + "%");

        scanner.close();
    }
}
