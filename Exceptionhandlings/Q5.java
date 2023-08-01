package Exceptionhandlings;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class Q5 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Please provide name and age as command line arguments.");
			return;
		}

		String name = args[0];
		int age = 0;

		try {
			age = Integer.parseInt(args[1]);
			validateAge(age);
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
		} catch (NumberFormatException e) {
			System.out.println("Invalid age. Age should be a valid integer.");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18 || age >= 60) {
			throw new InvalidAgeException("Invalid age. Age should be between 18 and 60.");
		}
	}
}
