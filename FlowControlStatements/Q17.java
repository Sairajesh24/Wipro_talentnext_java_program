package FlowControlStatements;

class ReverseNumber {
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

class Pallindrome {
    public void checkPallindrome(int input) {
        ReverseNumber rn = new ReverseNumber();
        int reversed = rn.reverse(input);
        
        if (reversed == input) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

public class Q17 {
    public static void main(String[] args) {
        Pallindrome p = new Pallindrome();
        p.checkPallindrome(1231);
        
    }
}
