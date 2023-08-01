package Exceptionhandlings;
import java.util.*;
//import java.lang.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            try {
                array[i] = scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        System.out.print("Enter the index of the array element you want to access: ");
        int index = scanner.nextInt();

        try {
            int element = array[index];
            System.out.println("The array element at index " + index + " = " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter a valid index within the range.");
        }

        scanner.close();
    }
}
