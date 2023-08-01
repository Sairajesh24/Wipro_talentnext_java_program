package set;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        TreeSet<String> elements = new TreeSet<>();

        elements.add("Sai");
        elements.add("MalayalaM");
        elements.add("hijack");
        elements.add("Sai");

        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String ele = sc.nextLine();
        sc.close();

        Iterator<String> it = elements.iterator();
        while (it.hasNext()) {
            String ele1 = it.next();
            if (ele.equalsIgnoreCase(ele1)) {
                System.out.println("Exist");
                String reverse = new StringBuilder(ele).reverse().toString();
                System.out.println("Reverse of " + ele + ": " + reverse);
                break;
            }
        }
    }
}