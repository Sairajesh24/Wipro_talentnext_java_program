package FlowControlStatements;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        String input1 = scanner.next();
        char ch1 = input1.charAt(0);

        System.out.print("Enter the second character: ");
        String input2 = scanner.next();
        char ch2 = input2.charAt(0);

        scanner.close();

        if ((int) ch1 > (int) ch2) {
            System.out.println(ch2 + "," + ch1);
        } else if ((int) ch1 < (int) ch2) {
            System.out.println(ch1 + "," + ch2);
        } else {
            System.out.println(ch2 + "," + ch1);
        }
    }
}
