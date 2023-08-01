package FlowControlStatements;

public class Q3 {
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Print all the values in a single line separated by commas
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
