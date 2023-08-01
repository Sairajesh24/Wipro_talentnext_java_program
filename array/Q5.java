package array;

public class Q5 {

    public static void main(String[] args) {
        int a[] = {90, 23, 56, 32, 57, 85, 824};
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2) {
                min2 = a[i];
            }

            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }

        System.out.println("Largest two numbers: " + max1 + ", " + max2);
        System.out.println("Smallest two numbers: " + min1 + ", " + min2);
    }
}
