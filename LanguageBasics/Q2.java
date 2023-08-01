package LanguageBasics;

public class Q2 {
	    public static void main(String[] args) {
	        // Check if a command line argument is provided
	        if (args.length == 0) {
	            System.out.println("Please provide a name as a command line argument.");
	            return;
	        }

	        // Retrieve the command line argument
	        String name = args[0];

	        // Generate the welcome message
	        String welcomeMessage = "Welcome " + name;

	        // Print the welcome message
	        System.out.println(welcomeMessage);
	    }
	}

//1.Compile the Java file using javac WelcomeMessage.java.
//2.Run the compiled file using java WelcomeMessage John, replacing "John" with the desired name.