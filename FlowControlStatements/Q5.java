package FlowControlStatements;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("Alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}

		scanner.close();
	}

}

