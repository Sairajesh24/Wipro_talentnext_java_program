package array;

public class Q3 {

	public static void main(String[] args) {

        int[] array = {3916, 253, 34, 56, 7};
        int searchElement = 56;

        int index = -1; // Initialize the index to -1

        // Iterate over the array to find the search element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                index = i; // Update the index if the search element is found
                break; // Exit the loop once the element is found
            }
        }

        // Print the result
        if (index == -1) {
            System.out.println("-1");
        } else {
            System.out.println(index);
        }
    }
}