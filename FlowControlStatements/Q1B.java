package FlowControlStatements;

import java.util.Scanner;

class LastDigit {
    LastDigit(int n1, int n2) {
        if (n1 % 10 == n2 % 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

public class Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        scanner.close();

        new LastDigit(num1, num2);
//      LastDigit ld = new LastDigit(num1, num2);
//      avoid above warning by changing above line to "new LastDigit(num1, num2);"
        
    }
}
