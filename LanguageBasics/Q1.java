package LanguageBasics;

public class Q1 {
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two arguments.");
            return;
        }

        // Retrieve the command line arguments
        String arg1 = args[0];
        String arg2 = args[1];

        // Generate the output in the required format
        String output = arg1 + " Technologies " + arg2;
        System.out.println(output);
    }
}


//1.Save the program code provided earlier into a file named CommandLineArgumentsExample.java.
//
//2.Open a command prompt or terminal and navigate to the directory where the CommandLineArgumentsExample.java file is located.
//
//3.Compile the Java file by running the following command:
//
//				javac Q1.java
//4.After successful compilation, run the program with two command line arguments by executing the following command:
//
//				java Q1 Wipro Bangalore
//5.Alternatively, you can replace "Wipro" and "Bangalore" with your desired strings.