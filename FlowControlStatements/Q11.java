package FlowControlStatements;

class Even {
    int input1, input2;

    public Even(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;

        for (int i = this.input1; i <= this.input2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class Q11 {
    public static void main(String[] args) {
        new Even(22, 37);
    }
}