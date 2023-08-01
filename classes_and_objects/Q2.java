package classes_and_objects;

class Calculator {

    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class Q2 {

    public static void main(String[] args) {
        int intResult = Calculator.powerInt(2, 3);
        System.out.println("PowerInt result: " + intResult);

        double doubleResult = Calculator.powerDouble(2.5, 2);
        System.out.println("PowerDouble result: " + doubleResult);
    }
}
