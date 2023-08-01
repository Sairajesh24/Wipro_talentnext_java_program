package FlowControlStatements;

class Prime {
    int input1, input2;

    public void check() {
        boolean isPrime;

        for (int i = input1; i <= input2; i++) {
            isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i+" ");
            }
        }
    }
}

public class Q13 {
    public static void main(String[] args) {
        Prime ip = new Prime();
        ip.input1 = 10;
        ip.input2 = 99;
        ip.check();
    }
}
