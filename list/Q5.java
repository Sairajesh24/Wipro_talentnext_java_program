package list;

import java.util.LinkedList;

public class Q5 {
    public static void main(String[] args) {
        LinkedList<String> months = new LinkedList<>();

        // Add all the months to the LinkedList
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print all the months
        System.out.println("Months of the year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}
