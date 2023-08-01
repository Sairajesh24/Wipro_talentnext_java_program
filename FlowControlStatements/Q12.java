package FlowControlStatements;

class isPrime {
    int input1;

    public isPrime(int input1) {
        this.input1 = input1;
        boolean isPrime = true;

        for (int i = 2; i <= input1 / 2; i++) {
            if (input1 % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

public class Q12 {
    public static void main(String[] args) {
        new isPrime(5);
    }
}
