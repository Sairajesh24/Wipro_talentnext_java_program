package packages;

import testPackage.Foundation;

public class Q1 {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
        // Try accessing the variables of the Foundation class
        // Uncomment the lines one by one to see the accessibility

        // Accessing var1 - Private variable (Not accessible)
        // System.out.println(foundation.var1);

        // Accessing var2 - Default variable (Accessible)
        //System.out.println(foundation.var2);

        // Accessing var3 - Protected variable (Accessible within the same package)
        //System.out.println(foundation.var3);

        // Accessing var4 - Public variable (Accessible)
        System.out.println(foundation.var4);
    }
}
