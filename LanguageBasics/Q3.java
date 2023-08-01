package LanguageBasics;

public class Q3 {
	    public static void main(String[] args) {
	        // Check if exactly two arguments are provided
	        if (args.length != 2) {
	            System.out.println("Please provide exactly two integers as command line arguments.");
	            return;
	        }

	        // Retrieve the command line arguments and convert them to integers
	        int num1 = Integer.parseInt(args[0]);
	        int num2 = Integer.parseInt(args[1]);

	        // Calculate the sum of the two numbers
	        int sum = num1 + num2;

	        // Print the result
	        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	    }
	}
//1.Compile the Java file using javac SumCalculator.java.
//2.Run the compiled file using java SumCalculator 10 20, replacing 10 and 20 with the desired integers.