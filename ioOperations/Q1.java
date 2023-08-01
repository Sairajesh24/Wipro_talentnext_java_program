package ioOperations;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();

        System.out.print("Enter the character to be counted: ");
        char character = scanner.nextLine().charAt(0);

        try {
            int count = countCharacterInFile(filename, character);
            System.out.printf("File '%s' has %d instances of letter '%c'.%n", filename, count, character);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static int countCharacterInFile(String filename, char character) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                for (int i = 0; i < line.length(); i++) {
                    if (Character.toLowerCase(line.charAt(i)) == Character.toLowerCase(character)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

