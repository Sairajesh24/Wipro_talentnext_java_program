package FlowControlStatements;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter color code (R, B, G, O, Y, W): ");
        char colorCode = scanner.next().charAt(0);

        String colorName;

        switch (Character.toUpperCase(colorCode)) {
            case 'R':
                colorName = "Red";
                break;
            case 'B':
                colorName = "Blue";
                break;
            case 'G':
                colorName = "Green";
                break;
            case 'O':
                colorName = "Orange";
                break;
            case 'Y':
                colorName = "Yellow";
                break;
            case 'W':
                colorName = "White";
                break;
            default:
                colorName = "Invalid Code";
        }

        System.out.println("Color name: " + colorName);

        scanner.close();
    }
}
