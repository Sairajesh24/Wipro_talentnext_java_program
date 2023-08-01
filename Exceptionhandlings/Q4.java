package Exceptionhandlings;

class InvalidCountryException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidCountryException() {
		super("User Outside India cannot be registered");
	}

	public InvalidCountryException(String message) {
		super(message);
	}
}


class UserRegistration {
	public static void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India")) {
			throw new InvalidCountryException();
		} else {
			System.out.println("User registration done successfully");
		}
	}
}

public class Q4 {
	public static void main(String[] args) {
		try {
			UserRegistration.registerUser("Mickey", "US");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}

		try {
			UserRegistration.registerUser("Mini", "India");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}