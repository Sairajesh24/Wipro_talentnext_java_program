package FlowControlStatements;

import java.util.Scanner;

class CheckSign {
    int n;

    public void sign() {
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

public class Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckSign cs = new CheckSign();

        System.out.print("Enter a number: ");
        cs.n = scanner.nextInt();
        scanner.close();

        cs.sign();
    }
}
