package FlowControlStatements;

class RevNumber {
    public int reverse(int input1) {
        int rev = 0;
        while (input1 > 0) {
            int rem = input1 % 10;
            rev = rev * 10 + rem;
            input1 /= 10;
        }
        return rev;
    }
}

public class Q16 {
    public static void main(String[] args) {
        RevNumber rn = new RevNumber();
        int reversed = rn.reverse(6534654);
        System.out.println("Reversed number: " + reversed);
    }
}
