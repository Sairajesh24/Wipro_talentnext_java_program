package Exceptionhandlings;

class MathOperation {
    public static void performMathOperation(int[] numbers) {
        try {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            double average = (double) sum / numbers.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred. Division by zero is not allowed.");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide 5 integers as command line arguments.");
            return;
        }

        int[] numbers = new int[5];

        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            MathOperation.performMathOperation(numbers);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide integers only.");
        }
    }
}
